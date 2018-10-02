package com.greenfoxacademy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GuardianController {

    @GetMapping("/groot")
    @ResponseBody
    public GrootMessage grootTranslate(@RequestParam(required = false) String message) {
        if (message == null) {
            return new GrootMessage();
        }
        return new GrootMessage(message);
    }

    @GetMapping("/yondu")
    @ResponseBody
    public Something yondusArrow(@RequestParam(required = false) Double distance, @RequestParam(required = false) Double time) {
        if (distance == null || time == null) {
            return new Something();
        }
        return new Something(distance, time);
    }
}

class Something {
    public Double distance;
    public Double time;
    public Double speed;
    public String error;

    public Something(Double distance, Double time) {
        this.distance = distance;
        this.time = time;
        this.speed = distance / time;
    }

    public Something() {
        this.error = "Something went wrong!";
    }
}

class GrootMessage {
    public String received;
    public String translated;
    public String error;

    public GrootMessage(String message) {
        this.received = message;
        this.translated = "I am groot";
    }

    public GrootMessage() {
        this.error = "I am groot";
    }
}

