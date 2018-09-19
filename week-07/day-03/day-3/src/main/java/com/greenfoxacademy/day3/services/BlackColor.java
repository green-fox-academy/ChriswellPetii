package com.greenfoxacademy.day3.services;

import com.greenfoxacademy.day3.interfaces.MyColor;
import org.springframework.stereotype.Service;

@Service
public class BlackColor implements MyColor {
    @Override
    public void printColor() {
        System.out.println("Its a black in color...");
    }
}
