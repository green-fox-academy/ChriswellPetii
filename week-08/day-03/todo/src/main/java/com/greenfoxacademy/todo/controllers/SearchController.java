package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.interfaces.TodoRepository;
import com.greenfoxacademy.todo.models.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {
    private TodoRepository todoRepository;

    public SearchController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @PostMapping("/search")
    public String searchPost(String name) {
        Todo todo = todoRepository.findByName(name).get();
        return "redirect:/search?name=" + todo.getName();
    }

    @GetMapping("/search")
    public String searchGet(@RequestParam("name") String name, Model model) {
        model.addAttribute("name",todoRepository.findByName(name));
        model.addAttribute("todos", todoRepository.findAllByName(name));
        return "todolist";
    }
}
