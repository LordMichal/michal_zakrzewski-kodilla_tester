package src.main.java;

public class LeapYear {
    public static void main(String[] args) {
        int year = 1593;
        System.out.println("Czy rok "+year+" jest przestepny?");
        if (year%4 == 0 || year%100==0 || year%400==0)
            System.out.println("Po namysle stwierdzam, ze "+year+" jest przestepny.");
        else System.out.println("Chyba zartujesz nie i nigdy nie bedzie!");
    }
}