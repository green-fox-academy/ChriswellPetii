package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.interfaces.TodoRepository;
import com.greenfoxacademy.todo.models.Todo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ComponentScan
public class DeleteController {
    private TodoRepository todoRepository;

    public DeleteController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        Todo todo = todoRepository.findById(id).get();
        todoRepository.delete(todo);
        return "redirect:/";
    }

}
