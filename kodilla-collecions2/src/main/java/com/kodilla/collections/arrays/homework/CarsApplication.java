package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;

import java.util.Random;

import static com.kodilla.collections.arrays.homework.CarUtils.drawCar;

public class CarsApplication {
    private static final Random random = new Random();

    public static void main(String[] args) {
        int arraySize = random.nextInt(15) +1;
        Car[] cars = new Car[arraySize];
        for (int n=0; n<cars.length; n++) {
            cars[n] = drawCar();
        }
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

}
