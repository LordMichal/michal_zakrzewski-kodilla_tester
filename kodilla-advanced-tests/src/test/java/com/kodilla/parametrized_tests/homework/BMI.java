package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMI {
    static Stream<Arguments> personData(){
        return Stream.of(
                Arguments.of(1.9, 42,"Very severely underweight"),
                Arguments.of(1.4, 23,"Very severely underweight"),
                Arguments.of(1.8, 265, "Very severely underweight"),
                Arguments.of(1.75, 70, "Very severely underweight")
        );
    }
}
