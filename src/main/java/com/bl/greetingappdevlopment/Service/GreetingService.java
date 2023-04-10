package com.bl.greetingappdevlopment.Service;

import com.bl.greetingappdevlopment.Entity.Greeting;
import com.bl.greetingappdevlopment.Repository.IGreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {
    public static final String template = "hello %s!";
    public static final AtomicLong id = new AtomicLong();

    @Autowired
    IGreetingRepository greetingRepository;
    public void saveGreeting(String name){
        Greeting greeting= new Greeting(id.incrementAndGet(), String.format(template,name));
        greetingRepository.save(greeting);
    }

    public Optional<Greeting> findGreeting(long id){
        return greetingRepository.findById(id);
    }
}