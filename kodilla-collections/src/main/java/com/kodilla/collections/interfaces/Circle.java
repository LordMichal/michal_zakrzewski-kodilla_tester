package com.kodilla.collections.interfaces;

public class Circle implements Shape {
    private double radius;

   public Circle(double radius){
        this.radius = radius;
    }
//    public double GetArea(){
//        return Math.PI*radius*radius;
//    }
//    @Override
//    public double getArea() {
//        return 0;
//    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}
