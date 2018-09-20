package com.greefoxacademy.thefoxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name;
    private List<String> listOfTricks = new ArrayList<>();
    private int trickCounter;
    private String food;
    private String drink;

    public Fox(String name) {
        if (name.equals("Mr.Green")) {
            this.name = name;
            this.food = "salad";
            this.drink = "water;";
            this.trickCounter = listOfTricks.size();
        } else {
            this.name = name;
            this.trickCounter = listOfTricks.size();
        }
    }

    public int getTrickCounter() {
        return trickCounter;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public String getName() {
        return name;
    }

    public List<String> getListOfTricks() {
        if (listOfTricks.isEmpty()) {
            List<String> empty = new ArrayList<>();
            empty.add("You know no tricks, yet. Go and learn some");
            return empty;
        }
        return listOfTricks;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
