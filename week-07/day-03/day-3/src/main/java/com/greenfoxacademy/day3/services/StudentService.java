package com.greenfoxacademy.day3.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private ArrayList<String> names;

    public StudentService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    public int studentCounter() {
        return names.size();
    }

    public String findStudentByName(String name) {
        for (int i = 0; i < names.size(); i++) {
            if (this.names.get(i).equals(name)) {
                return name + " student all ready a GFA's student";
            }
        }
        return name + " student not a GFA's student yet";
    }
}