package com.greenfoxacademy.finder.controller;

import com.greenfoxacademy.finder.service.UserService;
import com.model.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
@ComponentScan
public class AppController {
    private UserService userService;

    public AppController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String main(Model model, User user) {
        model.addAttribute("new_user", user);
        model.addAttribute("yolo", userService.getAll());
        return "main";
    }

    @PostMapping("/app")
    public String create(User user) {
        userService.save(user);
        return "redirect:/";
    }
}