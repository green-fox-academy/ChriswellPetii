package com.greenfoxacademy.todo.interfaces;

import com.greenfoxacademy.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TodoRepository extends CrudRepository<Todo, Long> {
    Iterable<Todo> findAllByName(String name);

    Optional<Todo> findByName(String name);
}
