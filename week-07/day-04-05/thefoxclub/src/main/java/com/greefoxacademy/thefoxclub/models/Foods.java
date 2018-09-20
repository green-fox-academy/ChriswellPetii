package com.greefoxacademy.thefoxclub.models;


import java.util.ArrayList;
import java.util.List;

public class Foods {
    private List<String> foodList = new ArrayList<>();


    public Foods() {
        this.foodList.add("Pizza");
        this.foodList.add("Gyros");
        this.foodList.add("Chips");
    }

    public List<String> getFoodList() {
        return foodList;
    }
}
