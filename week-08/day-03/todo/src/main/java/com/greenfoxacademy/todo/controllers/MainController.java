package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.interfaces.TodoServices;
import com.greenfoxacademy.todo.services.AssigneeService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@ComponentScan
public class MainController {
    private TodoServices todoServices;
    private AssigneeService assigneeService;

    public MainController(TodoServices todoServices, AssigneeService assigneeService) {
        this.todoServices = todoServices;
        this.assigneeService = assigneeService;
    }

    @RequestMapping("/todo")
    public String getListActive(@RequestParam(value = "isActive", required = false) Boolean isActive, Model model) {
        model.addAttribute("parameter", isActive);
        model.addAttribute("todos", todoServices.findAll());
        return "todolistactive";
    }

    @RequestMapping("/")
    public String getList(Model model) {
        model.addAttribute("todos", todoServices.findAll());
        return "todolist";
    }

    @RequestMapping("/assignees")
    public  String getAssignees(Model model){
        model.addAttribute("users", assigneeService.findAll());
        return "assigneeslist";
    }
}
