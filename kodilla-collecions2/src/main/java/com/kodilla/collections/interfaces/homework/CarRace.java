package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car ford = new Ford(0,15,7);
        odRace(ford);
        Car opel = new Opel(0,12,10);
        odRace(opel);
        Car toyota = new Toyota(0, 17,12);
        odRace(toyota);
    }

    public static void odRace(Car car){
        for (int i=0; i<3; i++){
            car.increaseSpeed();
        }
        for ( int i=0; i<2; i++){
            car.decreaseSpeed();
        }
        System.out.println("Koncowa predkosc "+   car.getSpeed());
    }
}
