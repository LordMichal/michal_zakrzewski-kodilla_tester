package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int Environment;

    public OperatingSystem(int Environment) {
        this.Environment = Environment;
    }

    public void turnOn() {
        System.out.println("System opreracyjny wydany");
    }

    public void turnOff() {
        System.out.println("Mozna bezpiecznie wylaczyc komputer");
    }

    public static class Windows extends OperatingSystem {
        public Windows(int Environment) {
            super(Environment);
        }

        @Override
        public void turnOn() {
            System.out.println("Witaj w systemie Windows");
            super.turnOn();
        }

        @Override
        public void turnOff() {
            System.out.println("Blue screen");
            super.turnOff();
        }
    }

    public class Linux extends OperatingSystem {
        public Linux(int Environment) {
            super(Environment);
        }

        @Override
        public void turnOn() {
            System.out.println("Lubisz Cinnamon?");
            super.turnOn();
        }

        @Override
        public void turnOff() {
            System.out.println("Zamykanie systemu");
            super.turnOff();
        }
    }
}







