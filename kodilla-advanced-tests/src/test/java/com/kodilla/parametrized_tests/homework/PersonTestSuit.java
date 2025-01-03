package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuit {
    @ParameterizedTest
    @MethodSource("com.kodilla.parametrized_tests.homework.BMI#personData")
    public void BMICalkulatorCorrektly(double height, int weight, String expectedCategory){
        Person person = new Person(weight, height);
        assertEquals(expectedCategory, person.getBMI());
    }
}