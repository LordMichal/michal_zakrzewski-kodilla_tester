package com.kodilla.interfaces;

import com.kodilla.interfaces.Shape;
import com.kodilla.interfaces.Square;
import com.kodilla.interfaces.Circle;

public class InterfacesDemo {
    public static void main(String[] args) {

        Shape square = new Square(10.0);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        Circle circle = new Circle(7);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
