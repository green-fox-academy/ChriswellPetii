package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.interfaces.TodoRepository;
import com.greenfoxacademy.todo.models.Todo;
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

    @RequestMapping(value = {"/", "/todo"})
    public String getList(@RequestParam(value = "isActive", required = false) Boolean isActive, Model model) {
        model.addAttribute("parameter", isActive);
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }

    @RequestMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        Todo todo = todoRepository.findById(id).get();
        todoRepository.delete(todo);
        return "redirect:/todo?isActive=true";
    }

    @GetMapping("/{id}/update")
    public String getUpdate(@PathVariable Long id, Model model) {
        Todo todo = todoRepository.findById(id).get();
        model.addAttribute("name", todo.getName());
        model.addAttribute("isDone", todo.isDone());
        model.addAttribute("isUrgent", todo.isUrgent());
        model.addAttribute("todo", todo);
        return "update";
    }

    @PostMapping("/{id}/update")
    public String postUpdate(@PathVariable Long id,Todo todo) {
//        Todo todo = todoRepository.findById(id).get();
//        todo.setDone(isDone);
//        todo.setUrgent(isUrgent);
//        todo.setName(name);
        todoRepository.save(todo);
        return "redirect:/todo?isActive=true";
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
