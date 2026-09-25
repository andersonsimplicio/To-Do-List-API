package com.andersonsimplicio.todolist.user;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import lombok.RequiredArgsConstructor;

@RestController 
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
   
    private final UserRepository userRepository;

    @PostMapping
    public ResponseEntity created(@RequestBody UserModel userModel){
       
        var user = this.userRepository.findByUsername(userModel.getUsername());
        var passwordHash =  BCrypt.withDefaults().hashToString(12, userModel.getPassword().toCharArray());

        if(user!= null)
        {
            System.out.println("Usuario já existe");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existe!");
        }
        userModel.setPassword(passwordHash);
        System.out.println("Nome: "+userModel.getName() +" "+ userModel.getUsername());
        var user_created = this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(user_created);

    }
}
