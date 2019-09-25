package com.company;

public class Triangle extends Figure implements Drawable{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        setName(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

     public double getPerimetr(){
        return sideA + sideB + sideC;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDD3A");
    }
}
