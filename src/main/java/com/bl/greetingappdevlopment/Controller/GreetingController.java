package com.bl.greetingappdevlopment.Controller;

import com.bl.greetingappdevlopment.Entity.Greeting;
import com.bl.greetingappdevlopment.Service.GreetingService;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam String name){
        return GreetingService.sayHello(name);
    }
}