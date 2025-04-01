package com.ironhack.hellospring.controller;

import com.ironhack.hellospring.model.Greet;
import com.ironhack.hellospring.model.GreetType;
import com.ironhack.hellospring.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetController {

    public GreetController(GreetService greetService) {
        this.greetService = greetService;
    }

    private final GreetService greetService;

//    @Autowired  // BAD PRACTICE: AVOID
//    private GreetService greetService;




    @GetMapping
    public Greet greet() {
        return greetService.greet();
    }
}
