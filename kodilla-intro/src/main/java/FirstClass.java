public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 200, 2000);
        System.out.println("Waga" +" "+ notebook.weight + " " + "Cena" + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        Notebook heavyNotebook = new Notebook(2000, 900, 2005);
        System.out.println("Waga" +" " +heavyNotebook.weight + " " + "Cena" + " "+ heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        Notebook oldNotebook = new Notebook(1200, 2323, 5421);
        System.out.println("Waga" + " "+ oldNotebook.weight + " "+ "Cena" + " " + oldNotebook.price );
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
    }
}
