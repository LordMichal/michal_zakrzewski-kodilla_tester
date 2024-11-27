package com.kodilla.list.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Ford ford = new Ford(600);
        cars.add(new Ford(123));
        cars.add(new Toyota(233));
        cars.add(new Opel(80));
        cars.add( new Opel(100));
        cars.add(new Toyota(99));
        cars.add(new Ford(55));

        for (Car car : cars){
            CarUtils.describeCar(car);
        }
        cars.remove(1);
        cars.remove(ford);

    }
}
