package com.kodilla.exception;

public class FirstExample {
    public static void main(String[] args) {
        String username = "Will will";
        String[] nameParts = username.split(" ");
        System.out.println("Firstname: " + nameParts[0]);
        System.out.println("Lastneme: " + nameParts[1]);
    }
}
