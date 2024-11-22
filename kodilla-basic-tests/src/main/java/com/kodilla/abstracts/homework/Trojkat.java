package com.kodilla.abstracts.homework;

public class Trojkat extends Shape{
    private double podstawa;
    private double wysokosc;

    public Trojkat(double podstawa, double wysokosc) {
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
    }
    @Override
    public double pole(){
        return (podstawa * wysokosc)/2;
    }

    @Override
    public double obwod(){
        return podstawa*3;
    }

public static class Trapez extends Shape {
    private double podstawa;
    private double podstawa2;
    private double wysokoscT;
    private double bok;

public Trapez(double podstawa, double podstawa2, double wysokoscT, double bok){
    this.podstawa = podstawa;
    this.podstawa2 = podstawa2;
    this.wysokoscT = wysokoscT;
    this.bok = bok;
}
    @Override
    public double pole(){
        return (((podstawa+podstawa2)*wysokoscT)/2);
    }
    @Override
    public double obwod(){
        return podstawa2+podstawa+(2*bok);
    }
}
}
