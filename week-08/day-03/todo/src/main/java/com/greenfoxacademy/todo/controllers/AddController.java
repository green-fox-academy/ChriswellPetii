package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.interfaces.TodoServices;
import com.greenfoxacademy.todo.models.Assignee;
import com.greenfoxacademy.todo.models.Todo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@ComponentScan
public class AddController {
    private TodoServices todoService;

    public AddController(TodoServices todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/add")
    public String getToDo() {
        return "todoadd";
    }

    @PostMapping("/add")
    public String postToDo(String name) {
        Assignee assignee = new Assignee("Peti", "peti@peti.kom");
        Todo todo = new Todo(name, assignee);
        todoService.save(todo);
        return "redirect:/";
    }


}
