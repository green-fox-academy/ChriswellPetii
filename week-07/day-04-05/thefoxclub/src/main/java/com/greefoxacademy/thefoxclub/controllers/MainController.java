package com.greefoxacademy.thefoxclub.controllers;

import com.greefoxacademy.thefoxclub.models.Fox;
import com.greefoxacademy.thefoxclub.services.CharactersService;
import com.greefoxacademy.thefoxclub.services.NutritionStoreService;
import com.greefoxacademy.thefoxclub.services.TrickCenterService;
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
        Fox fox = charactersService.findFoxByName(name);
        model.addAttribute("name", fox.getName());
        model.addAttribute("statusbar", "This is " + fox.getName() + ". Currently living on " + fox.getFood() + " and " + fox.getDrink() + ". He knows " + fox.getTrickCounter() + " tricks.");
        model.addAttribute("knowedtricks", fox.getListOfTricks());
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
