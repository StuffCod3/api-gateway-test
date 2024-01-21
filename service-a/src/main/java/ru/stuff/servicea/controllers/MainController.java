package ru.stuff.servicea.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-a")
public class MainController {

    @GetMapping("/hi")
    public String hello(){
        return "Hello from service A";
    }
}
