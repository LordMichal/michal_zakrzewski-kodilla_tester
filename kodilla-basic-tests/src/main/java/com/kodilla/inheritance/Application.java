package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args){
        CAR car = new CAR(4 ,5);
        car.turnOnLighst();

        Convertible convertible = new Convertible();
        convertible.turnOnLighst();
        System.out.println(convertible.getSeats());

    }
}
