package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResults = calculator.sum(a, b);
        assertEquals(13, sumResults);
    }
    @Test
    public void testSubstract(){
        Calculator calculator = new Calculator();
        int substactResults = calculator.substract(8,5);
        assertEquals(3,substactResults);
    }
    @Test
    public void  testSquare(){
        Calculator calculator = new Calculator();
        int squareResults = calculator.square(5);
        assertEquals(25,squareResults);
    }
}
