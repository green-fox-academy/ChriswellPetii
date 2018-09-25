package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.interfaces.TodoRepository;
import com.greenfoxacademy.todo.models.Todo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@ComponentScan
public class AddController {
    private TodoRepository todoRepository;

    public AddController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/add")
    public String getToDo() {
        return "todo";
    }

    @PostMapping("/add")
    public String postToDo(String name) {
        Todo todo = new Todo(name);
        todoRepository.save(todo);
        return "redirect:/todo?isActive=true";
    }


}
