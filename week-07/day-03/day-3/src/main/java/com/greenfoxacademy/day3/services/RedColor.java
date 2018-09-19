package com.greenfoxacademy.day3.services;

import com.greenfoxacademy.day3.interfaces.MyColor;
import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {
    @Override
    public void printColor() {
        System.out.println("Its a red in color...");
    }
}
