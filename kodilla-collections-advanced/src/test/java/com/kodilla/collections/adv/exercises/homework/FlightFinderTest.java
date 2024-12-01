package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {
    @Test
    public void testfindFlightsFrom(){
        //Given
        FlightFinder flightFinder = new FlightFinder();
        String departureCity = "Roma";

        //When
        List<Flight> results = flightFinder.findFlightsFrom(departureCity);

        //Then
        assertNotNull(results);
        assertFalse(results.isEmpty());
        for (Flight flight : results){
            assertEquals(departureCity, flight.getDeparture());
        }
    }

    @Test
    public void testfindFlightsTo(){
        //Given
        FlightFinder flightFinder = new FlightFinder();
            String arrivalCity = "Paris";

        //When
        List<Flight> results = flightFinder.findFlightsTo(arrivalCity);

        //Then
        assertNotNull(results);
        assertFalse(results.isEmpty());
        for (Flight flight: results){
            assertEquals(arrivalCity, flight.getArrival());

        }
    }
}