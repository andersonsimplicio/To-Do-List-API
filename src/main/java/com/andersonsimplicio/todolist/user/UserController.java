package com.andersonsimplicio.todolist.user;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;


@RestController 
@RequestMapping("/users")
public class UserController {
    @Autowired 
    private UserRepository userRepository;

    @PostMapping
    public UserModel created(@RequestBody UserModel user){
        System.out.println("Nome: "+user.getName() +" "+ user.getUsername());
        var user_created = this.userRepository.save(user);
        return user_created;

    }
}
