package com.example.test4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/controller")
@RestController
public class MainController {

    @GetMapping("/test")
    public String mainController() {
        return "Этот контроллер не работает без авторизации";
    }
}