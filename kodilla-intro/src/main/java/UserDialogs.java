import java.util.Scanner;

public class UserDialogs {
    public static String getUsersname() {
        Scanner scaner = new Scanner(System.in);
        while (true){
            System.out.println("Enter your name:");
            String name = scaner.nextLine().trim();
            if (name.length() >= 2) {
                return name;
            }
            System.out.println("Name is too short. Try again");
        }
    }
}
