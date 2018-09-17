package com.greefoxacademy.helloworld.controllers;

import com.greefoxacademy.helloworld.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam("name") String name) {
        Greeting greeting = new Greeting(1, "Hello " + name + "!");
        return greeting;
    }
}
