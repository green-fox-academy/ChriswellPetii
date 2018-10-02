package com.greenfoxacademy.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/appenda/{appended}")
    @ResponseBody
    public AppendA getAppendA(@PathVariable String appended) {
        if (appended == null) {
            return new AppendA();
        }
        return new AppendA(appended);
    }

    @PostMapping("/dountil/{action}")
    @ResponseBody
    public DoUntilOut doMath(@PathVariable String action, @RequestBody(required = false) DoUntil doUntil) {
        if (action == null || doUntil == null) {
            return new DoUntilOut("error");
        }

        DoUntilOut doUntilOut = new DoUntilOut();

        if (action.equals("sum")) {
            int sum = 0;
            for (int i = 1; i <= doUntil.until; i++) {
                sum += i;
            }
            doUntilOut.result = sum;
            return doUntilOut;
        }
        if (action.equals("factor")) {
            int fact = 1;
            for (int i = 1; i <= doUntil.until; i++) {
                fact *= i;
            }
            doUntilOut.result = fact;
            return doUntilOut;
        }
        return doUntilOut;
    }

    static class DoUntil {
        public Integer until;

        public DoUntil(String action, Integer until) {
            this.until = until;
        }

        public DoUntil() {
        }

    }

    static class DoUntilOut {
        public Integer result;
        public String error;

        public DoUntilOut() {

        }

        public DoUntilOut(String string) {
            this.error = "Please provide a number!";
        }
    }

    static class AppendA {
        public String appended;
        public String error;

        public AppendA(String appended) {
            this.appended = appended + "a";
        }

        public AppendA() {
            this.error = "Please provide appandable!";
        }
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