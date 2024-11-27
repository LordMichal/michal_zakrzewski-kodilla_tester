public class Grades {
    private int[] grades;
    private int size;


    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public double add() {
        if (this.size == 10) {
            return 0;

            this.grades[this.size] = size;
            this.size++;
        }
        this.grades = grades;
        for (int i = this.size - 1; i >= 0; i--) {
            if (grades[size] != 0) {
                System.out.println("Ostatnia dodana ocena:" + grades[size]);
                return grades[size] - 1;
            }

            double Suma = 0;
            for (double ocena : grades) {
                Suma += ocena;
                double srednia = Suma / grades.length;
                return Suma / grades.length;
                System.out.println("Średnia ocen to: " + srednia);
            }


        }
    }

}







