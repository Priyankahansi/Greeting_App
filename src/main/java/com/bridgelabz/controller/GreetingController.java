package com.bridgelabz.controller;
import com.bridgelabz.entity.Greeting;
import com.bridgelabz.service.IGreetingApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @Autowired
    IGreetingApp greetingApp;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new Greeting(counter.incrementAndGet(),String.format(template, name));
    }
    @GetMapping("/hello")
   public String hello()
   {
       String msg=greetingApp.getMessage();
       return msg;
   }

    @PostMapping("/messages")
     public String message(@RequestBody Greeting greeting){
     String getGreeting=greetingApp.getGreeting(greeting);
     return getGreeting;
   }
    @GetMapping("/getMessage/{getId}")
    public Greeting getMessage(@PathVariable long getId)
    {
        Greeting greeting=greetingApp.getGreetingMessage(getId);
        return greeting;
    }
    @GetMapping("/getGreeting")
    public List<Greeting> getMessages()
    {
        List<Greeting> greeting=greetingApp.getGreetings();
        return greeting;
    }
}



