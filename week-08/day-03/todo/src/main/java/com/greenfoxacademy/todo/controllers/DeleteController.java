package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.models.Assignee;
import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.services.AssigneeService;
import com.greenfoxacademy.todo.services.TodoService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ComponentScan
public class DeleteController {
    private TodoService todoService;
    private AssigneeService assigneeService;

    public DeleteController(TodoService todoService, AssigneeService assigneeService) {
        this.todoService = todoService;
        this.assigneeService = assigneeService;
    }


    @RequestMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        Todo todo = todoService.findById(id);
        todoService.delete(todo);
        return "redirect:/";
    }

    @RequestMapping("/{id}/deleteuser")
    public String deleteUser(@PathVariable Long id) {
        Assignee assignee = assigneeService.findById(id);
        assigneeService.deleteAssignee(assignee);
        return "redirect:/assigneeslist";
    }

}
