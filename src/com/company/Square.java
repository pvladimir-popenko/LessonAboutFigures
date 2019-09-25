package com.company;

import com.sun.org.apache.bcel.internal.generic.FieldGen;

public class Square extends Figure implements Drawable{
    private double side;

    public Square(String name, double side) {
        setName(name);
        this.side = side;
    }

    public double getPerimetr() {
        return side * 4;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDD32");
    }
}
