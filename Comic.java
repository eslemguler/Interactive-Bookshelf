package ijae3.xguler03;

public class Comic extends Literature {
    String title;
    int year;
    Author author;
    String genre;

    public Comic(String title, Author author, int year, String genre) {
        super(title, year, author);
        this.genre = genre;
        this.title = title;
        this.year = year;
        this.author = author;
    }
}
