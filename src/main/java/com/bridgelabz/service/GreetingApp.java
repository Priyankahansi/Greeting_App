package com.bridgelabz.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingApp implements IGreetingApp {

    @Override
    public String getMessage() {
        return "Hello World";
    }
}




