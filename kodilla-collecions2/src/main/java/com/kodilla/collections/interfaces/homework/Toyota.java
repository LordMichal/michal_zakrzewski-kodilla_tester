package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car{

    private int speed;
    private int gas;
    private int hamulec;

    public Toyota(int speed, int gas, int hamulec){
        this.speed=speed;
        this.gas = gas;
        this.hamulec = hamulec;
    }
    public Toyota(int speed){
        this.speed=speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = speed + gas;

    }

    @Override
    public void decreaseSpeed() {
        this.speed = speed - hamulec;
    }
    @Override
    public int getSpeed() {
        return this.speed;
    }
}
