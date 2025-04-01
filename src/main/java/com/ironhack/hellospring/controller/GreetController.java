package com.ironhack.hellospring.controller;

import com.ironhack.hellospring.model.Greet;
import com.ironhack.hellospring.service.GreetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetController {



    private final GreetService greetService;

    public GreetController(GreetService greetService) {
        this.greetService = greetService;
    }

//    @Autowired  // BAD PRACTICE: AVOID
//    private GreetService greetService;




    @GetMapping
    public Greet greet() {
        return greetService.greet();
    }

    @GetMapping("/personal") // E.J. "/greet/personal?name=Paco"
    //    public Greet personalGreet(@RequestParam("name") String name){
    public Greet personalGreet(@RequestParam(value = "name", required = false) String name) {
        return greetService.greetPersonal(name);
    }
}
