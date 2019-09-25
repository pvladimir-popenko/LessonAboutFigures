package com.company;

public abstract class Animal {
    private String name;
    abstract void getVoice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
