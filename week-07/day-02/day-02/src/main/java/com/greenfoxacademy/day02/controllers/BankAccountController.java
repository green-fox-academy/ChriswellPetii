package com.greenfoxacademy.day02.controllers;

import com.greenfoxacademy.day02.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {
    @RequestMapping("/show")
    public String account(Model model) {
        model.addAttribute("account", new BankAccount("Simba", 2000, "lion"));
        return "index";
    }
}
