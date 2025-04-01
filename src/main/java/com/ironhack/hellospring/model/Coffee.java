package com.ironhack.hellospring.model;

public class Coffee {

    private String name;
    private String origin;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Coffee(String name, String origin, Double price) {
        this.name = name;
        this.origin = origin;
        this.price = price;
    }
}
