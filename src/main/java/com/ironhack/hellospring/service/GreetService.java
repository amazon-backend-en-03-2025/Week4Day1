package com.ironhack.hellospring.service;

import com.ironhack.hellospring.model.Greet;
import com.ironhack.hellospring.model.GreetType;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GreetService {

    public Greet greet() {
        LocalDateTime currentTime = LocalDateTime.now();
        if (currentTime.getHour() > 12 && currentTime.getHour() < 18) {
            return new Greet("Good Afternoon!", GreetType.FORMAL);
        } else if (currentTime.getHour() > 17) {
            return new Greet("Good Evening!", GreetType.FORMAL);
        } else  {
            return new Greet("Good Morning!", GreetType.CASUAL);
        }



    }

}
