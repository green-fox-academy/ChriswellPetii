package com.greefoxacademy.helloworld.controllers;

import com.greefoxacademy.helloworld.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam("name") String name) {
        Greeting greeting = new Greeting("Hello " + name + "!");
        return greeting.getContent() + " This site was loaded " + greeting.getId() + " times since last server start.";
    }

}
