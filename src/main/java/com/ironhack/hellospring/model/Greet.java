package com.ironhack.hellospring.model;

public class Greet {
    private String message;
    private GreetType type;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public GreetType getType() {
        return type;
    }

    public void setType(GreetType type) {
        this.type = type;
    }

    public Greet(String message, GreetType type) {
        this.message = message;
        this.type = type;
    }
}
