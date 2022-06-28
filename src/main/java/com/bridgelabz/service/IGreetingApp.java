package com.bridgelabz.service;

import com.bridgelabz.entity.Greeting;

import java.util.List;

public interface IGreetingApp {
    public String getMessage();

    public String getGreeting(Greeting greeting);

    Greeting getGreetingMessage(long getId);

    List<Greeting> getGreetings();

    void deleteMessage(long id);

    Greeting updateUserMessage(long getId, Greeting greeting);

}




