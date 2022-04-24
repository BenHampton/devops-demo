package com.devopsdemo.devops.Service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String getTestMessage() {
        return "Hello World";
    }

    public String getTestGreetingMessage(String name) {
        return "Welcome to the world " + name;
    }
}
