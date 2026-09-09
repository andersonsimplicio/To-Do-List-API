package com.andersonsimplicio.todolist.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController 
@RequestMapping("/olamundo")
public class PrimeiraController {
    @GetMapping("/springboot")
    public String msg(){
        return "Inicio dos trabalhos com Spring";
    }

}
