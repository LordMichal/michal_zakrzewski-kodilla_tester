public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 200);
        System.out.println("Waga" +" "+ notebook.weight + " " + "Cena" + " " + notebook.price);
        notebook.checkPrice();
        Notebook heavyNotebook = new Notebook(2000, 900,);
        System.out.println("Waga" +" " +heavyNotebook.weight + " " + "Cena" + " "+ heavyNotebook.price);
        notebook.checkPrice();
        Notebook oldNotebook = new Notebook(1200, 2323);
        System.out.println("Waga" + " "+ oldNotebook.weight + " "+ "Cena" + " " + oldNotebook.price );
        notebook.checkPrice();
    }
}
