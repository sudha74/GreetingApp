package com.bl.greetingappdevlopment.Controller;

import com.bl.greetingappdevlopment.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    GreetingService greetingService;
    @GetMapping("/greeting")
    public String greeting(@RequestParam String name){
        greetingService.saveGreeting(name);
        return "Success";
    }
}