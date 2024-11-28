public class Grades {
    private int[] grades;
    private int size;


    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        System.out.println("Ostatnia dosana ocena + " + Last());
        System.out.println("Srednia ocen to " + getAverage());
    }

    public double add() {
        if (this.size == 10) {
            return 0;
            this.grades[this.size] = size;
            this.size++;
        }
    }
    public double getAverage() {
        if (this.size == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = this.size - 1; i >= 0; i--) {
            sum += this.grades[i];
        }
        return sum / this.size;
    }

    public int Last(){
        if (this.size ==0){
            return -1;
        }
        return this.grades[this.size-1];
    }

}







