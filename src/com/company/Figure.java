package com.company;

public abstract class Figure {
    private String name;
    abstract double getPerimetr();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
