import java.util.Scanner;

public class Kolory {

    public static String Kolor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaka ma byś pierwsza litera koloru: ");
        String litera = scanner.nextLine().toLowerCase();

        switch (litera) {
            case "c":
                return "czerwony";
            case "n":
                return "niebieski";
            case "z":
                return "zielony";
            default:
                return "Nie ma tylu kolorów.";
        }
    }
    public static void main(String[] args){
        String kolor = Kolor();
        System.out.println("Wybrany kolor: " + kolor);
    }
}
