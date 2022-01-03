package ijae3.xguler03;

public interface LiteratureHolder {
         void addLiterature(Literature lit);
         void removeLiterature(Literature lit);
         void printShelf();
         void printLiteratureBy(Author a);
         void printLiteratureBetweenYears(int yearFrom, int yearTo);
}
