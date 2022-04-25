package com.example.demoproyecto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/test-proyecto")
    String proyectoTest(){
        return "Hola";
    }
}
