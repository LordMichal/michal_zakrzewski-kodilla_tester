package com.kodilla.inheritance;

public class CAR {
    private int wheels;
    private int seats;

    public CAR (int wheels, int seats) {
        this.wheels = wheels;
        this.seats = seats;
    }

    public void turnOnLighst() {
        System.out.println("lights were turned on");
    }
    public void openDoors(){
        System.out.println("Opening 4 doors");
    }
    public CAR(){System.out.println("Car constructor");}
    public  int getWheels(){return wheels;}
    public  int getSeats(){return seats;}

}
