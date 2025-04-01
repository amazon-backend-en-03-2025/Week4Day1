package com.ironhack.hellospring.controller;

import com.ironhack.hellospring.model.Coffee;
import com.ironhack.hellospring.service.CoffeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {

    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    private final CoffeeService coffeeService;


    @GetMapping
    public List<Coffee> getAllCoffee() {
        return coffeeService.getAllCoffees();
    }
}
