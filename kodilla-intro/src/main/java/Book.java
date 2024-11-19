public class Book {
    private final String author;
    private final String title;

    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title) {
        return new Book(author, title);
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Book book = of("Isaac Asimov", "The Galaxy");
        System.out.println("Autor:" + book.getAuthor());
        System.out.println("Title:" + book.getTitle());
    }
}


