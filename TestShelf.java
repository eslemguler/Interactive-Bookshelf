
package ijae3.xguler03;


public class TestShelf extends Bookshelf{

    public static void main(String[] args) {

        Author author = new Author("JK", "Rowling");
        Literature kitap =  new Book("Harry Potter", author,2006, "Bloomsburry");

        Author author2 = new Author("Eslem", "Guler");
        Literature dergi = new Comic("Little Mina", author2,2012, "Fun");
        Literature dergi2 = new Comic("Big Mina", author2,2018, "Education");


        Author author3 = new Author("Yigithan", "Kose");
        Literature kitap2 = new Comic("Mechanics", author3,2021, "Engineering");

        Bookshelf kitaplik = new Bookshelf();
        kitaplik.addLiterature(kitap);
        kitaplik.addLiterature(dergi);
        kitaplik.addLiterature(dergi2);
        kitaplik.addLiterature(kitap2);

        kitaplik.printShelf();
        System.out.println("\n");
        kitaplik.printLiteratureBy(author2);
        System.out.println("\n");
        kitaplik.printLiteratureBetweenYears(2012,2021);

        kitaplik.removeLiterature(kitap);
        System.out.println("\n");
        kitaplik.printShelf();

    }


}