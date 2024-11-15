public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price <= 600) {
            System.out.println("This notebook is cheap");
        } else if (this.price <= 1000) System.out.println("This Price is good");
        else {
            System.out.println("This Notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight <= 1000){
            System.out.println("This notebook is very light");
        } else if (this.weight <=1900) {
            System.out.println("This notebook weight is typical");
        } else {System.out.println ("This laptop is very hevy");
        }
    }
}
