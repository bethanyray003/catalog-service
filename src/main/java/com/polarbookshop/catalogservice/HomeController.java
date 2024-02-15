package com.polarbookshop.catalogservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.polarbookshop.catalogservice.config.PolarProperties;

@RestController
public class HomeController {
    private final PolarProperties properties;

    public HomeController(PolarProperties properties){
        this.properties = properties;
    }

    @GetMapping("/")
    public String getGreeting(){
        //return "Welcome to the book catalog!";
        return properties.getGreeting();
    }
}
