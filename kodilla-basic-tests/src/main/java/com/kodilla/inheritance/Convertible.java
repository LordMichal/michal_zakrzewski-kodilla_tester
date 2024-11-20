package com.kodilla.inheritance;

public class Convertible extends CAR{
    public void openRoof() {
        System.out.println("Opening roof...");
    }
    public void closeRoof(){
        System.out.println("Closing roof ...");
    }
    @Override public void openDoors() {System.out.println("Opem 2 doors");}
    public Convertible(){super();System.out.println("Convertible construciton");}
}

