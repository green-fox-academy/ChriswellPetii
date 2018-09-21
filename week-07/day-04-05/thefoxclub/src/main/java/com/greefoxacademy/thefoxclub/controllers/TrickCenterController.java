package com.greefoxacademy.thefoxclub.controllers;

import com.greefoxacademy.thefoxclub.models.Fox;
import com.greefoxacademy.thefoxclub.services.CharactersService;
import com.greefoxacademy.thefoxclub.services.TrickCenterService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ComponentScan
public class TrickCenterController {
    private TrickCenterService trickCenterService;
    private CharactersService charactersService;

    public TrickCenterController(TrickCenterService trickCenterService, CharactersService charactersService) {
        this.trickCenterService = trickCenterService;
        this.charactersService = charactersService;
    }

    @RequestMapping("/trickcenter")
    public String trickCenter(@RequestParam("name") String name, Model model) {
        Fox fox = charactersService.findFoxByName(name);
        model.addAttribute("fox", fox);
        model.addAttribute("foxtricklist", fox.getListOfTricks());
        model.addAttribute("tricklist", trickCenterService.getTricks().getListOfTricks());
        return "trickcenter";
    }

    @PostMapping("/setTrick")
    public String setTrick(@RequestParam("name") String name, String trickforset) {
        Fox fox = charactersService.findFoxByName(name);
        fox.learnNewTrick(trickforset);
        return "redirect:/?name=" + fox.getName();
    }

}
