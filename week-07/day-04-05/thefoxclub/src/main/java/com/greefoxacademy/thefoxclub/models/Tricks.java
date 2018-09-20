package com.greefoxacademy.thefoxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Tricks {
    private List<String> listOfTricks = new ArrayList<>();

    public Tricks() {
        listOfTricks.add("Barel roll");
        listOfTricks.add("Crack the phone screen");
        listOfTricks.add("Stole someone's knife");
        listOfTricks.add("Smoke cigarette");
    }

    public List<String> getListOfTricks() {
        if (listOfTricks.isEmpty()) {
            List<String> empty = new ArrayList<>();
            empty.add("You know no tricks, yet. Go and learn some");
            return empty;
        }
        return listOfTricks;
    }

}
