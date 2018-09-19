package com.greenfoxacademy.day3;


import com.greenfoxacademy.day3.models.Printer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day3Application implements CommandLineRunner {
    private Printer printer;

    public static void main(String[] args) {
        SpringApplication.run(Day3Application.class, args);
    }

    public Day3Application(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run(String[] args) throws Exception {
        printer.log("hello");
    }
}
