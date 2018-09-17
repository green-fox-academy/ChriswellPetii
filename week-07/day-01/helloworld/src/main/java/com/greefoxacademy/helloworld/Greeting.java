package com.greefoxacademy.helloworld;

import static com.greefoxacademy.helloworld.AtomicLong.lastID;

public class Greeting {
    private long id;
    private String content;

    public Greeting(String content) {
        this.id = lastID() + 1;
        this.content = content;
        AtomicLong.greetingList.add(this);
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
