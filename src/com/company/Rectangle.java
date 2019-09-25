package com.company;

public class Rectangle extends Figure implements Drawable{
    private double sideA;
    private double sideB;

    public Rectangle(String name, double sideA, double sideB) {
        setName(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getPerimetr(){
       return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDDBE");
    }
}
