package com.kodilla.abstracts.homework;

public class Prostokat extends Shape{
    private double wysokosc;
    private double szerokosc;

    public Prostokat(double wysokosc, double szerokosc){
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
    }
    @Override
    public double pole(){
        return wysokosc * szerokosc;
    }
    @Override
    public double obwod(){
        return 2 * (wysokosc+szerokosc);
    }

}
