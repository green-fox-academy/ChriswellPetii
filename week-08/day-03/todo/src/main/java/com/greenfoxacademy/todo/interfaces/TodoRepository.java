package com.greenfoxacademy.todo.interfaces;

import com.greenfoxacademy.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
