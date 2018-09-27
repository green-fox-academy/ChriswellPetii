package com.greenfoxacademy.todo.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assignee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    @Transient
    private String username;

    @OneToMany(mappedBy = "assignee")
    private List<Todo> todos;

    public Assignee(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
