public class Applicatiion {
    private String name;
    private double age;
    private double height;


    public Applicatiion(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] arg) {
        Applicatiion Adam = new Applicatiion("Adam", 40.5, 178);

        if (Adam.age > 30 && Adam.height > 160) {
            System.out.println("starszy niż 30 i jest wyzszy niż 160");
        }
        else {
            System.out.println("ma co najwyzej 30 lub jest niższszy nix 160");
        }
    }
}




