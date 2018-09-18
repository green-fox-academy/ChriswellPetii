package com.greenfoxacademy.day02.controllers;

import com.greenfoxacademy.day02.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {
    List<BankAccount> bankAccountList = new ArrayList<>();

    @RequestMapping("/show")
    public String account(Model model) {
        model.addAttribute("account", new BankAccount("Simba", 2000, "lion"));
        return "index";
    }

    @RequestMapping("/point")
    public String endPointing(Model model) {
        model.addAttribute("string", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "endpoint";
    }

    @RequestMapping("/lolk")
    public String valami(Model model) {
        bankAccountList.add(new BankAccount("Nala", 2500, "lion"));
        bankAccountList.add(new BankAccount("Timon", 300, "meerkat"));
        bankAccountList.add(new BankAccount("Pumba", 50, "warthog"));
        bankAccountList.add(new BankAccount("Scar", 2250, "lion"));
        bankAccountList.add(new BankAccount("Mufasa", 50, "lion"));
        model.addAttribute("balist", bankAccountList);
        return "listoflionkings";
    }
}
