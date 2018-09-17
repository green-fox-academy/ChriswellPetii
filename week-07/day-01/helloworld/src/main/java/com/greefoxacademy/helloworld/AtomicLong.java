package com.greefoxacademy.helloworld;

import java.util.ArrayList;
import java.util.List;

public class AtomicLong {
    public static List<Greeting> greetingList = new ArrayList<>();

    public static int lastID() {
        return greetingList.size();
    }
}
