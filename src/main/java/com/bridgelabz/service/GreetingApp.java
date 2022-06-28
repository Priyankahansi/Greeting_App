package com.bridgelabz.service;

import com.bridgelabz.entity.Greeting;
import com.bridgelabz.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Greeting getGreetingMessage(long getId) {
      Optional<Greeting> greeting  =repo.findById(getId);
      return greeting.get();
    }

    @Override
    public List<Greeting> getGreetings() {
        List<Greeting> greetings=repo.findAll();
        return greetings;
    }
}




