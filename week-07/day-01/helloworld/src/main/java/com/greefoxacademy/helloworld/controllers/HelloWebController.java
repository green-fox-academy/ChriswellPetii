package com.greefoxacademy.helloworld.controllers;

import com.greefoxacademy.helloworld.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class HelloWebController {
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    String[] colors = {"red", "blue", "black", "green", "yellow", "orange", "darkred", "pink", "darkblue", "darkgreen"};

    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam("name") String name, Model model) {
        Random random = new Random();
        model.addAttribute("name", name);
        model.addAttribute(" counter", AtomicLong.lastID());
        int randomH = random.nextInt(hellos.length - 1);

        model.addAttribute("id", Integer.toString(AtomicLong.lastID()));
        model.addAttribute("hello", hellos[randomH]);
        int randomC = random.nextInt(colors.length - 1);
        model.addAttribute("randomcolor", colors[randomC]);
        int randomsize = random.nextInt(40) + 16;
        model.addAttribute("randomsize", randomsize);
        return "greeting";
    }
}
