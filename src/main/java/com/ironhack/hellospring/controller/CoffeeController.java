package com.ironhack.hellospring.controller;

import com.ironhack.hellospring.model.Coffee;
import com.ironhack.hellospring.service.CoffeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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


    @GetMapping("/{origin}") // E.J. "/coffee/italy"
    public List<Coffee> getAllCoffeeByOrigin(@PathVariable("origin") String origin) {
        return coffeeService.getAllCoffeeByOrigin(origin);
    }

}
