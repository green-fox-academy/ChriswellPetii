package com.greenfoxacademy.day02.controllers;

import com.greenfoxacademy.day02.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {
    public static List<BankAccount> bankAccountList = new ArrayList<>();

    @RequestMapping("/show")
    public String account(Model model) {
        model.addAttribute("account", new BankAccount("Nala", 2000, "lion", false));
        return "index";
    }

    @RequestMapping("/point")
    public String endPointing(Model model) {
        model.addAttribute("string", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "endpoint";
    }

    @RequestMapping("/lolk")
    public String valami(Model model) {
        bankAccountList.add(new BankAccount("Simba", 2500, "lion", true));
        bankAccountList.add(new BankAccount("Timon", 300, "meerkat", false));
        bankAccountList.add(new BankAccount("Pumba", 50, "warthog", false));
        bankAccountList.add(new BankAccount("Scar", 2250, "lion", false));
        bankAccountList.add(new BankAccount("Mufasa", 50, "lion", false));
        model.addAttribute("balist", bankAccountList);
        return "listoflionkings";
    }
}
