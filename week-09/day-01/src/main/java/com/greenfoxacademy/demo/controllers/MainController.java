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
}