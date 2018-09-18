package com.greenfoxacademy.day02.controllers;

import com.greenfoxacademy.day02.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {
    public static List<BankAccount> bankAccountList = new ArrayList<>();

    @RequestMapping("/show")
    public String account(Model model) {
        model.addAttribute("account", new BankAccount("Nala", 2000, "lion", false, true));
        return "index";
    }

    @RequestMapping("/point")
    public String endPointing(Model model) {
        model.addAttribute("string", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "endpoint";
    }

    @PostMapping("/lolk")
    public String lionKing(Model model) {
        bankAccountList.add(new BankAccount("Simba", 2500, "lion", true, true));
        bankAccountList.add(new BankAccount("Timon", 300, "meerkat", false, true));
        bankAccountList.add(new BankAccount("Pumba", 50, "warthog", false, true));
        bankAccountList.add(new BankAccount("Scar", 2250, "lion", false, false));
        bankAccountList.add(new BankAccount("Mufasa", 50, "lion", false, true));
        model.addAttribute("balist", bankAccountList);
        return "listoflionkings";
    }

    @GetMapping("/lolk")
    public String lionking(Model model) {
        model.addAttribute("balist", bankAccountList);
        return "listoflionkings";
    }
}
