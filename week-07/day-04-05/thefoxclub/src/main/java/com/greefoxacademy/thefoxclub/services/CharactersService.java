package com.greefoxacademy.thefoxclub.services;

import com.greefoxacademy.thefoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CharactersService {
    private List<Fox> foxList = new ArrayList<>();

    public void register(String name) {
        foxList.add(new Fox(name));
    }

    public Fox login(String name) {
        if (findFoxByName(name) == null) {
            register(name);
        }
        return findFoxByName(name);
    }

    public Fox findFoxByName(String name) {
        for (Fox aFoxList : foxList) {
            if (aFoxList.getName().equals(name)) {
                return aFoxList;
            }
        }
        return null;
    }
}
