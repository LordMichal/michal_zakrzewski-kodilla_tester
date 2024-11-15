import java.util.Random;

public class RandomNumbers {


    public void draw() {
        int maxNumber = 0;
        int minNumber = 0;
        int suma=0;
        int max = 100;
        Random random = new Random();

        while(suma <= max)
        {
            int number = random.nextInt(31);
            suma += number;
            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number < minNumber) {
                minNumber = number;
            }

        }
        System.out.println("Największa wylowowana liczba to " + maxNumber);
        System.out.println("Najmniejsza wylosowana liczba to " + minNumber);
    }
}