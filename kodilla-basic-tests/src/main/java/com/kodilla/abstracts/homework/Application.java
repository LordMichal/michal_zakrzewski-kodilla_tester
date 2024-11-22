package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape prostkat = new Prostokat(165,6566);
        Shape trojkat = new Trojkat(12616, 56);
        Shape trapez = new Trojkat.Trapez(65,66546,66,64656);

        System.out.println("Pole prostokąta " + prostkat.pole());
        System.out.println("Obwód prostokąta " + prostkat.obwod());
        System.out.println("Pole trójkąta " + trojkat.pole());
        System.out.println(("Pole trójkąta równobocznego " + trojkat.obwod()));
        System.out.println("Pole trapezu " + trapez.pole());
        System.out.println("Obwód trpaezu "+ trapez.obwod());


    }
}
