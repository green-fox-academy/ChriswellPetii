package com.greenfoxacademy.day3.controllers;

import com.greenfoxacademy.day3.services.StudentService;
import com.greenfoxacademy.day3.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class D3AppController {
    private UtilityService utilityService = new UtilityService();
    private StudentService studentService = new StudentService();

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

    @RequestMapping("/gfa")
    public String gfa(Model model) {
        model.addAttribute("studentcount", studentService.studentCounter());
        return "gfa";
    }

    @RequestMapping("/gfa/list")
    public String gfaList(Model model) {
        model.addAttribute("gfalist", studentService.findAll());
        return "gfalist";
    }

    @RequestMapping("/gfa/add")
    public String gfaAdd() {
        return "gfaadd";
    }

    @RequestMapping("/gfa/save")
    public String gfaSave(@RequestParam("name") String name) {
        studentService.save(name);
        return "gfasave";
    }

    @GetMapping("/gfa/check")
    public String gfaCheckGet() {
        return "gfacheckget";
    }

    @PostMapping("/gfa/check")
    public String gfaCheckGet(@RequestParam("name") String name, Model model) {
        model.addAttribute("checkedstudent", studentService.findStudentByName(name));
        return "gfacheckpost";
    }
}
