package com.greefoxacademy.thefoxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Drinks {
    private List<String> drinkList = new ArrayList<>();

    public Drinks() {
        this.drinkList.add("Cola");
        this.drinkList.add("Beer");
        this.drinkList.add("Tea");
    }

    public List<String> getDrinkList() {
        return drinkList;
    }
}
