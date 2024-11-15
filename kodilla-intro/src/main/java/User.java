public class User {

    private String imie;
    private int wiek;

    public User(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
String getImie() {
        return imie;
}
//    Int getWiek(){
//        return imie;
//    }
    public static void main(String[] arg) {
        User adam = new User("Adam", 49);
        User bartek = new User("Bartek", 46);
        User antek = new User("Antek", 71);
        User krysia = new User("Krysia", 69);
        User marta = new User("Marta", 22);
        User[] users = {adam, bartek, antek, krysia, marta};

        int sumawieku = 0;
        for (User user : users) {
            sumawieku += user.wiek;
        }
        double sredniaWieku = (double) sumawieku / users.length;
        System.out.println("Uzytkownicy młodsi od średniej wieku: ");
        for (User user : users) {
            if (user.wiek < sredniaWieku) {
                System.out.println(user.imie);
            }
        }
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.draw();
    }

}

//    public static String najmlodsi (User[] users) {
//        String mlodsi ="";
//        for ( int i=0; i< users.length; i++) {
//            int wiek = users[i].wiek;
//            double srednia = User.sredniaWieku(users);
//            if (wiek < srednia) {
//                mlodsi = users[i].imie;
//
//            }
//        }
//        return mlodsi;}








