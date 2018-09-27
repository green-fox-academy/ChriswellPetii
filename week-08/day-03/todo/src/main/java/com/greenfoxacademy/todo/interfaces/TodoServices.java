package com.greenfoxacademy.todo.interfaces;

import com.greenfoxacademy.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TodoServices extends CrudRepository<Todo, Long> {

    Todo findByName(String name);

    Iterable<Todo> findAllByName(String name);
}
