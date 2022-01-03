package ijae3.xguler03;

public class Book extends Literature {
    String title;
    int year;
    Author author;
    String publisher;

    public Book(String title, Author author, int year, String publisher ) {
        super(title, year, author);
        this.title = title;
        this.year = year;
        this.author = author;
        this.publisher = publisher;
    }

}
