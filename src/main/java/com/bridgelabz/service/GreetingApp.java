package com.bridgelabz.service;

import com.bridgelabz.entity.Greeting;
import com.bridgelabz.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingApp implements IGreetingApp {

    @Autowired
    GreetingRepo repo;

    @Override
    public String getMessage() {

        return "Hello World";
    }

    @Override
    public String getGreeting(Greeting greeting) {
        repo.save(greeting);
        return greeting.toString();
    }

}




