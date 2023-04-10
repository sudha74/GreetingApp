package com.bl.greetingappdevlopment.Controller;

import com.bl.greetingappdevlopment.Entity.Greeting;
import com.bl.greetingappdevlopment.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class GreetingController {

    @Autowired
    GreetingService greetingService;
    @PostMapping("/greeting")
    public String greeting(@RequestParam String name){
        greetingService.saveGreeting(name);
        return "Success";
    }

    @GetMapping("/greeting")
    public Optional<Greeting> findGreeting(@RequestParam long id){
        return greetingService.findGreeting(id);
    }
}