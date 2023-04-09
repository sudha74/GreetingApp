package com.bl.greetingappdevlopment.Controller;

import com.bl.greetingappdevlopment.Entity.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting() {
        return "hello";
    }
}