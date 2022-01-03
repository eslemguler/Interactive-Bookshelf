package ijae3.xguler03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bookshelf implements LiteratureHolder{
        Literature literature;

        private static List<Literature> theLiterature = new ArrayList<>();

        @Override
        public void addLiterature(Literature lit) {
                theLiterature.add(lit);
        }

        @Override
        public void removeLiterature(Literature lit) {
                theLiterature.remove(lit);
        }

        @Override
        public void printShelf() {
                theLiterature.sort(Comparator.comparing(x-> x.author.surname + x.author.name + x.title + x.year));

                        theLiterature.forEach(Literature -> {System.out.print(Literature.author.surname + ", "
                        + Literature.author.name + ":"+ Literature.title + "(" + Literature.year
                        + ") -");
                                if (Literature instanceof Book){
                                        System.out.print("Book (" + ((Book) Literature).publisher + ")\n");
                                }

                                else if(Literature instanceof Comic){
                                        System.out.print("Comic (" + ((Comic) Literature).genre + ")\n");
                                }
                        });
                }

        @Override
        public void printLiteratureBy(Author a) {
                System.out.println("The Books Written By "+ a.name +" "+ a.surname+":");
                for (int j = 0; j < theLiterature.size(); j++) {
                        if (theLiterature.get(j).author.equals(a)) {
                                System.out.print(theLiterature.get(j).title + "(" + theLiterature.get(j).year+")- ");
                                if (theLiterature.get(j) instanceof Book) {
                                        System.out.print("Book (" + ((Book) theLiterature.get(j)).publisher + ")\n");
                                } else if (theLiterature.get(j) instanceof Comic) {
                                        System.out.print("Comic (" + ((Comic) theLiterature.get(j)).genre + ")\n");
                                }
                        }
                }
        }

        @Override
        public void printLiteratureBetweenYears(int yearFrom, int yearTo) {
                System.out.println("The Books Written Between The Years "+ yearFrom + "-"+ yearTo +":");
                for (int k=0; k<theLiterature.size();k++){
                        if(theLiterature.get(k).year >= yearFrom && theLiterature.get(k).year <= yearTo){
                                System.out.print(theLiterature.get(k).author.surname +"," + theLiterature.get(k).author.name
                                + ":" + theLiterature.get(k).title + "(" + theLiterature.get(k).year+")- ");
                                if (theLiterature.get(k) instanceof Book) {
                                        System.out.print("Book (" + ((Book) theLiterature.get(k)).publisher + ")\n");
                                } else if (theLiterature.get(k) instanceof Comic) {
                                        System.out.print("Comic (" + ((Comic) theLiterature.get(k)).genre + ")\n");
                                }
                        }
                }
        }
}