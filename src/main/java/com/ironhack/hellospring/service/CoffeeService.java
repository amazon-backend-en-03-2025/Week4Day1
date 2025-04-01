package com.ironhack.hellospring.service;

import com.ironhack.hellospring.model.Coffee;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeService {


    private List<Coffee> coffeeList;


    @PostConstruct
    private void init(){

        coffeeList = new ArrayList<>();
        coffeeList.addAll(
                List.of(
                        new Coffee("Espresso", "Italy", 2.5),
                        new Coffee("Cappuccino", "Italy", 3.0),
                        new Coffee("Latte", "Italy", 3.5),
                        new Coffee("Americano", "USA", 2.0),
                        new Coffee("Mocha", "USA", 4.0),
                        new Coffee("Flat White", "Australia", 3.5),
                        new Coffee("Macchiato", "Italy", 2.5),
                        new Coffee("Affogato", "Italy", 4.5)
                )
        );

        System.out.println("Coffee List Initialized");
    }


    public List<Coffee> getAllCoffees() {
        return coffeeList;
    }


    public List<Coffee> getAllCoffeeByOrigin(String origin) {
        List<Coffee> filteredCoffees = new ArrayList<>();
        for (int i = 0; i < coffeeList.size(); i++) {
            if (coffeeList.get(i).getOrigin().equalsIgnoreCase(origin)) {
                filteredCoffees.add(coffeeList.get(i));
            }
        }
        return filteredCoffees;
    }
}
