package com.company;

public class Main {

    public static void main(String[] args) {


        /*Square square = new Square("Квадрат", 4);
        System.out.println( "Perimetr of " + square.getName() + " is: " + square.getPerimetr());

        Rectangle rectangle = new Rectangle("Сложное имя", 12.6, 13.8);
        System.out.println("Perimetr of " + rectangle.getName() + " is: " + rectangle.getPerimetr());*/

        Figure[] figures = new Figure[]{
                new Circle("Circle", 5),
                new Triangle("Triangle", 3, 4, 5),
                new Square("Square", 5),
                new Rectangle("Rectangle", 4, 5),
                new Circle("Кружок", 5),
                new Triangle("Треугольничек", 3, 4, 5),
                new Square("Квадратик", 5),
                new Rectangle("Прямоугольничек", 4, 5)
        };

        for (Figure figure :
                figures) {
            System.out.println("Name of Figure is: " + figure.getName());
            System.out.println("Perimetr of Figure is: " + figure.getPerimetr());
        }

        Dog dog = new Dog("Бобик");
        dog.draw();
        dog.callSound();




    }
}
