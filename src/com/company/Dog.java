package com.company;

public class Dog extends Animal implements Drawable, SoundProducable{

    public Dog(String name) {
        setName(name);
    }

    @Override
    void getVoice() {

        System.out.println("Гав");
    }


    @Override
    public void draw() {
        System.out.println("\uD83D\uDC36");
    }

    @Override
    public void callSound() {
        System.out.println("Ну типа гав гав");
    }
}
