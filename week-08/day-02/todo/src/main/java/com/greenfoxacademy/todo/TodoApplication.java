package com.greenfoxacademy.todo;

import com.greenfoxacademy.todo.interfaces.TodoRepository;
import com.greenfoxacademy.todo.models.Todo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
    private TodoRepository todoRepository;

    public TodoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
        todoRepository.save(new Todo("I have to pee"));
        todoRepository.save(new Todo("I have to learn how can i create new Todos"));
        todoRepository.save(new Todo("I have to learn how can i stop typing shits"));
    }
}
