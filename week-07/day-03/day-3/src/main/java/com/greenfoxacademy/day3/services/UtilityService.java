package com.greenfoxacademy.day3.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
    private final ArrayList<String> colors;
    private final Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String validateEmail(String info) {
        if (info.contains("@") && info.contains(".")) {
            return info + " is a valid email address";
        }
        return info + " is not valid email address";
    }

    public boolean validateEmailBool(String info) {
        if (info.contains("@") && info.contains(".")) {
            return true;
        }
        return false;
    }


    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }
}