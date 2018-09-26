package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.interfaces.TodoRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@ComponentScan
public class TodoController {
    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping("/todo")
    public String getListActive(@RequestParam(value = "isActive", required = false) Boolean isActive, Model model) {
        model.addAttribute("parameter", isActive);
        model.addAttribute("todos", todoRepository.findAll());
        return "todolistactive";
    }

    @RequestMapping("/")
    public String getList(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }
}
