package com.kodilla.inheritance.homework;

public class Main  {
    public static void main(String[] args) {
        OperatingSystem windowsxp = new OperatingSystem.Windows(2010);
        OperatingSystem linux = new OperatingSystem(1997);

        windowsxp.turnOff();
        linux.turnOff();
    }
}
