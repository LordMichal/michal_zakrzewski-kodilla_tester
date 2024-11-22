package com.kodilla.abstracts.homework;

public class Main {
    public static void main(String[] args) {
        Rolnik rolnik = new Rolnik (12000);
        Nauczyciel nauczyciel= new Nauczyciel(5000);
        Makler makler = new Makler(20000);

        Person person1 = new Person("Igor", 40, rolnik);
        Person person2 = new Person("Agata",45, nauczyciel);
        Person person3 = new Person("Teodozjusz", 28, makler);

        person1.printResponsibilities();
        person2.printResponsibilities();
        person3.printResponsibilities();
    }
}
