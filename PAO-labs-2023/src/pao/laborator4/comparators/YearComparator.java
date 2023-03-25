package pao.laborator4.comparators;

import java.util.Comparator;

public class YearComparator  implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getYear() - o2.getYear();
    }
}
