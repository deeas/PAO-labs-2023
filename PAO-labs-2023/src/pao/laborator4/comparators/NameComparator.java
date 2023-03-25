package pao.laborator4.comparators;

import java.util.Comparator;

public class NameComparator implements Comparator<Book> {
    /**
     * Returns:
     * - the value 0 if the arguments are equal
     * - a value less than 0 if x < y
     * - a value greater than 0 if x > y
     */
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
