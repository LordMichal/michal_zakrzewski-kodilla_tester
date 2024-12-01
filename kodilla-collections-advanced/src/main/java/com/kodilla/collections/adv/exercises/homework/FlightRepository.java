package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Crakov","Brecau"));
        flights.add(new Flight("Gdansk", "Praga"));
        flights.add(new Flight("Praga","Budapest"));
        flights.add(new Flight("Roma", "Paris"));
        return flights;
    }
}
