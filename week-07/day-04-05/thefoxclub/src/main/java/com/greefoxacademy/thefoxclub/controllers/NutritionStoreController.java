package com.greefoxacademy.thefoxclub.controllers;

import com.greefoxacademy.thefoxclub.models.Fox;
import com.greefoxacademy.thefoxclub.services.CharactersService;
import com.greefoxacademy.thefoxclub.services.NutritionStoreService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ComponentScan
public class NutritionStoreController {
    private NutritionStoreService nutritionStoreService;
    private CharactersService charactersService;

    public NutritionStoreController(NutritionStoreService nutritionStoreService, CharactersService charactersService) {
        this.nutritionStoreService = nutritionStoreService;
        this.charactersService = charactersService;
    }

    @RequestMapping("/nutritionstore")
    public String nutritionStore(@RequestParam("name") String name, Model model) {
        Fox fox = charactersService.findFoxByName(name);
        model.addAttribute("fox", fox);
        model.addAttribute("foodlist", nutritionStoreService.getFoods().getFoodList());
        model.addAttribute("drinklist", nutritionStoreService.getDrinks().getDrinkList());
        return "nutritionstore";
    }

    @PostMapping("/setNutri")
    public String setNutriFood(@RequestParam("name") String name, String food, String drink) {
        Fox fox = charactersService.findFoxByName(name);
        fox.setFood(food);
        fox.setDrink(drink);
        return "redirect:/?name=" + fox.getName();
    }

}
