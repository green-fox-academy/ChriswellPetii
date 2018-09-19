package com.greenfoxacademy.day3.controllers;

import com.greenfoxacademy.day3.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class D3AppController {
    UtilityService utilityService = new UtilityService();

    @RequestMapping("/useful")
    public String mainpage() {
        return "useful";
    }

    @RequestMapping("/useful/colored")
    public String coloredpage(Model model) {
        model.addAttribute("randomcolor", utilityService.randomColor());
        return "colored";
    }

}
