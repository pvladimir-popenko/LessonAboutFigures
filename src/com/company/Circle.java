package com.company;

public class Circle extends Figure implements Drawable{
    private double radius;


    public Circle(String name, double radius) {
        setName(name);
        this.radius = radius;
    }

    public double getPerimetr() {
        return 2 * 3.14 * radius;
    }

    @Override
    public void draw() {
        System.out.println("⚫");
    }
}
