package com.greenfoxacademy.todo.interfaces;

import com.greenfoxacademy.todo.models.Assignee;
import org.springframework.data.repository.CrudRepository;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}
