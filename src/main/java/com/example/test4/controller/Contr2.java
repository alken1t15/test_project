package com.example.test4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contr2 {
    @GetMapping("/")
    public String mainController() {
        return "Этот контроллер работает";
    }
}
