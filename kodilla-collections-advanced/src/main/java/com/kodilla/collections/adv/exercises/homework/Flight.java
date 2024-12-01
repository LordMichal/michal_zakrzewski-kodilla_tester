package com.kodilla.collections.adv.exercises.homework;

public class Flight {
    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    String departure;
    String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }
}
