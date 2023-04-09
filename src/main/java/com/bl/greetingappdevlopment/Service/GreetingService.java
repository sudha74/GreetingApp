package com.bl.greetingappdevlopment.Service;

import com.bl.greetingappdevlopment.Entity.Greeting;

import java.util.concurrent.atomic.AtomicLong;

public class GreetingService {
    public static final String template = "hello %s!";
    public static final AtomicLong id = new AtomicLong();

    public static Greeting sayHello(String name){
        return new Greeting(id.incrementAndGet(), String.format(template,name));
    }
}