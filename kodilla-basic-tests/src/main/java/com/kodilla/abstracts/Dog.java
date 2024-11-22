package com.kodilla.abstracts;

public class Dog extends Animal {

    public  Dog(int numberOfLegs) {
        super (numberOfLegs );
    }

    @Override
    public void giveVoice() {

    }

    @Override
    public void getVoice() {
        System.out.println("Hau hau");

    }
}
