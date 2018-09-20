package com.greefoxacademy.thefoxclub.controllers;

import com.greefoxacademy.thefoxclub.services.CharactersService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ComponentScan
public class MainController {
    private CharactersService charactersService;

    public MainController(CharactersService charactersService) {
        this.charactersService = charactersService;
    }

    @RequestMapping("/")
    public String mainPage(@RequestParam("name") String name, Model model) {
        charactersService.login(name);
        model.addAttribute("statusbar", "This is " + charactersService.findFoxByName(name).getName() + ". Currently living on " + charactersService.findFoxByName(name).getFood() + " and " + charactersService.findFoxByName(name).getDrink() + ". He knows " + charactersService.findFoxByName(name).getTrickCounter() + " tricks.");
        model.addAttribute("knowedtricks", charactersService.findFoxByName(name).getListOfTricks());
        return "index";
    }

    @PostMapping("/")
    public String postLoginPage(String name) {
        return "redirect:/?name=" + name;
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }
}
