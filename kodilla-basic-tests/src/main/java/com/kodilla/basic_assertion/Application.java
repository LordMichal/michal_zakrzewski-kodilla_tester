package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + "i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + "i " + b);
        }

        int substactResults = calculator.substract(8, 5);
        boolean correctSubstract = ResultChecker.assertEquals(3, substactResults);
        if (correctSubstract) {
            System.out.println("Metoda substract działa popawnie dla  liczb " + a + "i" + b);
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + a +"i " +b);
        }

        int squareResults = calculator.square(3);
        boolean correctSquare = ResultChecker.assertEquals(9,squareResults);
        if (correctSquare){ System.out.println("Metoda działa dla liczby " + a);
        }
        else {System.out.println("Metoda nie dział dla liczby " + a);
        }
    }
}