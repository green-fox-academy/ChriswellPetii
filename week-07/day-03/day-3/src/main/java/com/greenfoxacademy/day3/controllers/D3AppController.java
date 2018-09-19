package com.greenfoxacademy.day3.controllers;

import com.greenfoxacademy.day3.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class D3AppController {
    private UtilityService utilityService = new UtilityService();

    @RequestMapping("/useful")
    public String mainpage() {
        return "useful";
    }

    @RequestMapping("/useful/colored")
    public String coloredpage(Model model) {
        model.addAttribute("randomcolor", utilityService.randomColor());
        return "colored";
    }

    @RequestMapping("/useful/email")
    public String email(@RequestParam("email") String email, Model model) {
        model.addAttribute("validate", utilityService.validateEmail(email));
        model.addAttribute("validateBool", utilityService.validateEmail(email));
        return "email";
    }
}
