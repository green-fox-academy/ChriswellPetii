package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.interfaces.TodoServices;
import com.greenfoxacademy.todo.models.Assignee;
import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.services.AssigneeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UpdateController {
    private TodoServices todoServices;
    private AssigneeService assigneeService;

    public UpdateController(TodoServices todoServices, AssigneeService assigneeService) {
        this.todoServices = todoServices;
        this.assigneeService = assigneeService;
    }

    @GetMapping("/{id}/update")
    public String getUpdate(@PathVariable Long id, Model model) {
        Todo todo = todoServices.findById(id).get()
        model.addAttribute("name", todo.getName());
        model.addAttribute("isDone", todo.isDone());
        model.addAttribute("isUrgent", todo.isUrgent());
        model.addAttribute("todo", todo);
        return "todoupdate";
    }

    @PostMapping("/{id}/update")
    public String postUpdate(@PathVariable Long id, Todo todo) {
        todoServices.save(todo);
        return "redirect:/";
    }

    @GetMapping("/{id}/updateuser")
    public String getUpdateUser(@PathVariable Long id, Model model) {
        Assignee assignee = assigneeService.findById(id);
        model.addAttribute("name", assignee.getUsername());
        model.addAttribute("email", assignee.getEmail());
        model.addAttribute("user", assignee);
        return "assigneesupdate";
    }

    @PostMapping("/{id}/updateuser")
    public String postUpdateUser(@PathVariable Long id, Assignee assignee) {
        assigneeService.save(assignee);
        return "redirect:/assigneeslist";
    }


    @GetMapping("/{id}/updatedone")
    public String updateDone(@PathVariable Long id) {
        Todo todo = todoServices.findById(id).get();
        todo.setDone(!todo.isDone());
        todoServices.save(todo);
        return "redirect:/";
    }

    @GetMapping("/{id}/updateurgent")
    public String updateUrgent(@PathVariable Long id) {
        Todo todo = todoServices.findById(id).get();
        todo.setUrgent(!todo.isUrgent());
        todoServices.save(todo);
        return "redirect:/";
    }

    @GetMapping("/{id}/updatedoneactive")
    public String updateDoneActive(@PathVariable Long id) {
        Todo todo = todoServices.findById(id).get();
        todo.setDone(!todo.isDone());
        todoServices.save(todo);
        return "redirect:/todo?isActive=" + !todo.isDone();
    }

    @GetMapping("/{id}/updateurgentactive")
    public String updateUrgentActive(@PathVariable Long id) {
        Todo todo = todoServices.findById(id).get();
        todo.setUrgent(!todo.isUrgent());
        todoServices.save(todo);
        return "redirect:/todo?isActive=" + !todo.isDone();
    }


}
