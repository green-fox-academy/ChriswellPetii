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
    private NutritionStoreService nutritionStoreService;
    private TrickCenterService trickCenterService;

    public MainController(CharactersService charactersService, NutritionStoreService nutritionStoreService, TrickCenterService trickCenterService) {
        this.charactersService = charactersService;
        this.nutritionStoreService = nutritionStoreService;
        this.trickCenterService = trickCenterService;
    }

    @RequestMapping("/")
    public String mainPage(@RequestParam("name") String name, Model model) {
        charactersService.login(name);
        model.addAttribute("name", charactersService.findFoxByName(name).getName());
        model.addAttribute("statusbar", "This is " + charactersService.findFoxByName(name).getName() + ". Currently living on " + charactersService.findFoxByName(name).getFood() + " and " + charactersService.findFoxByName(name).getDrink() + ". He knows " + charactersService.findFoxByName(name).getTrickCounter() + " tricks.");
        model.addAttribute("knowedtricks", charactersService.findFoxByName(name).getListOfTricks());
        return "index";
    }

    @PostMapping("/")
    public String postLoginPage(String name) {
        return "redirect:/?name=" + name;
    }

    @PostMapping("/setNutri")
    public String setNutriFood(@RequestParam("name") String name, String food, String drink) {
        Fox fox = charactersService.findFoxByName(name);
        fox.setFood(food);
        fox.setDrink(drink);
        return "redirect:/?name=" + fox.getName();
    }

    @PostMapping("/setTrick")
    public String setTrick(@RequestParam("name") String name, String trickforset) {
        Fox fox = charactersService.findFoxByName(name);
        fox.learnNewTrick(trickforset);
        return "redirect:/?name=" + fox.getName();
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

    @RequestMapping("/nutritionstore")
    public String nutritionStore(@RequestParam("name") String name, Model model) {
        model.addAttribute("fox", charactersService.findFoxByName(name));
        model.addAttribute("foodlist", nutritionStoreService.getFoods().getFoodList());
        model.addAttribute("drinklist", nutritionStoreService.getDrinks().getDrinkList());
        return "nutritionstore";
    }

    @RequestMapping("/trickcenter")
    public String trickCenter(@RequestParam("name") String name, Model model) {
        model.addAttribute("fox", charactersService.findFoxByName(name));
        model.addAttribute("foxtricklist",charactersService.findFoxByName(name).getListOfTricks());
        model.addAttribute("tricklist", trickCenterService.getTricks().getListOfTricks());
        return "trickcenter";
    }
}
