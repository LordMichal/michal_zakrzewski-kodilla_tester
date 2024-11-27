package com.kodilla.collections.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {

        Shape square = new Square(10.0);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        Circle circle = new Circle(7);
        System.out.println(circle.GetArea());
        System.out.println(circle.getPerimeter());
    }
}
