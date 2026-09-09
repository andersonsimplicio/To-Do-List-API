package com.andersonsimplicio.todolist.user;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController 
@RequestMapping("/users")
public class UserController {
    
     @PostMapping("/")
    public void created(@RequestBody UserModel user){
        System.out.println(user);
    }
}
