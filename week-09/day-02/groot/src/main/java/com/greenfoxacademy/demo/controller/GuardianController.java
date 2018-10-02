package com.greenfoxacademy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GuardianController {

    @GetMapping("/groot")
    @ResponseBody
    public GrootMessage grootTranslate(@RequestParam(required = false)String message) {
        if (message == null) {
            return new GrootMessage();
        }
        return new GrootMessage(message);
    }
}


class GrootMessage{
    public String received;
    public String translated;
    public String error;

    public GrootMessage(String message) {
        this.received = message;
        this.translated = "I am groot";
    }
    public GrootMessage(){
        this.error = "I am groot";
    }
}

