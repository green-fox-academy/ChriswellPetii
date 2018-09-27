package com.greenfoxacademy.todo.services;

import com.greenfoxacademy.todo.models.Assignee;

public interface AssigneeService {
    void save(Assignee assignee);

    Iterable<Assignee> findAll();

    Assignee findById(long id);

    void updateAssignee(Assignee assignee);

    void deleteAssignee(Assignee assignee);
}
