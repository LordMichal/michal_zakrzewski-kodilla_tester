package com.kodilla.list;

import com.kodilla.interfaces.Circle;
import com.kodilla.interfaces.Shape;
import com.kodilla.interfaces.Square;
import com.kodilla.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();
        shapes.add(new Square(10));
        shapes.add(new Circle(7));
        shapes.add(new Triangle(10,4,10.77));

        for (Shape shape : shapes) {
            System.out.println(shape+ ", area: "+ shape.getArea()+", parimetr "+  shape.getPerimeter());
        }
    }
}
