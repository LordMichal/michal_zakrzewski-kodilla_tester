package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Mieszko I",851.33, 654.0, true ));
        stamps.add((new Stamp("Bolelaw Chrobry", 351, 5313, false)));
        stamps.add(new Stamp("Mieszko II", 51, 35133, true));
        stamps.add((new Stamp("Kazimierz Odnowiciel", 123,131.2, false)));
        stamps.add(new Stamp("Bolesław Smialy", 543 , 5451, false));
        stamps.add((new Stamp("Władysław I", 123.0, 123,true)));
        stamps.add(new Stamp("Mieszko II", 51, 35133, true));
        stamps.add(new Stamp("Boleslaw III", 1232.232, 3123134.23,true));

        System.out.println(stamps.size());

        for (Stamp stamp:stamps){
            System.out.println(stamp);
        };

    }
}
