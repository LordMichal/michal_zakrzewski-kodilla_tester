package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-------------------------");
        System.out.println("Car: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Toyota)
            return "Toyota";
        else
            return "Nie wiem co to jest";
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawCar = random.nextInt(3);
        int a = getRandomSpeed(random);
        if (drawCar == 0)
            return new Ford(a);
        else if (drawCar == 1)
            return new Opel(a);
        else
            return new Opel(a);
    }
    private static int getRandomSpeed(Random random){
        return random.nextInt(250) +1;
    }
}

