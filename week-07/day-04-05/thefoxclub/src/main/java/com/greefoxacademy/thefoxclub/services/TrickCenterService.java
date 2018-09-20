package com.greefoxacademy.thefoxclub.services;

import com.greefoxacademy.thefoxclub.models.Tricks;
import org.springframework.stereotype.Service;

@Service
public class TrickCenterService {
    private Tricks tricks = new Tricks();

    public String findTrickByName(String name) {
        for (int i = 0; i < tricks.getListOfTricks().size(); i++) {
            if (tricks.getListOfTricks().get(i).equals(name)) {
                return tricks.getListOfTricks().get(i);
            }
        }
        return null;
    }

    public Tricks getTricks() {
        return tricks;
    }
}
