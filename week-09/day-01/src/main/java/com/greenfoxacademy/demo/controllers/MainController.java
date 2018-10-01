package com.greenfoxacademy.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/")
    public String getMainPage() {
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public Double getDoubling(@RequestParam(value = "input", required = false) Integer input) {
        if (input == null) {
            Double error = new Double("Error");
            return error;
        }
        Double duble = new Double(input);
        return duble;

    }

    @GetMapping("/greeter")
    @ResponseBody
    public Greeter getGreeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null || title == null) {
            Greeter greeter = new Greeter("Error");
        }
        Greeter greeter = new Greeter(name, title);
        return greeter;
    }

    static class Double {
        public Integer received;
        public Integer result;
        public String error;

        public Double(Integer received) {
            this.received = received;
            this.result = received * 2;
            this.error = null;
        }

        public Double(String error) {
            this.error = "Please provide an input!";
        }
    }

    static class Greeter {
        public String welcome_message;
        public String error;

        public Greeter(String name, String title) {
            this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
            this.error = null;
        }

        public Greeter(String error) {
            this.error = "Please provide a name";
        }
    }
}