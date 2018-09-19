package com.greenfoxacademy.day3;


import com.greenfoxacademy.day3.services.BlackColor;
import com.greenfoxacademy.day3.services.GreenColor;
import com.greenfoxacademy.day3.services.Printer;
import com.greenfoxacademy.day3.services.RedColor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day3Application implements CommandLineRunner {
    private Printer printer;
    private RedColor redColor;
    private BlackColor blackColor;
    private GreenColor greenColor;

    public static void main(String[] args) {
        SpringApplication.run(Day3Application.class, args);
    }

    public Day3Application(Printer printer, RedColor redColor, BlackColor blackColor, GreenColor greenColor) {
        this.printer = printer;
        this.redColor = redColor;
        this.blackColor = blackColor;
        this.greenColor = greenColor;
    }

    @Override
    public void run(String[] args) throws Exception {
        printer.log("hello");
        redColor.printColor();
        blackColor.printColor();
        greenColor.printColor();
    }
}
