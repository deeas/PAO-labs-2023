package pao.laborator4.comparators;

import java.util.Arrays;

public class Book implements Comparable<Book> {

    private int year;

    private String name;

    private String author;

    public Book(int year, String name, String author) {
        this.year = year;
        this.name = name;
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Book book) {
        /*
        * Returns:
        * - positive integer, if the current object is greater than the
        specified object.
        * - negative integer, if the current object is less than the
        specified object.
        * - zero, if the current object is equal to the specified object.
        */
        return this.year - book.year;
    }

    public static void main(String[] args) {
        Book prideAndPrejudice = new Book(1900, "Pride and Prejudice", "Jane Austen");
        Book senseAndSensibility = new Book(1910, "Sense and Sensibility", "Jane Austen");

        Book[] books = new Book[]{prideAndPrejudice, senseAndSensibility};

        // Using comparable
        Arrays.sort(books);
        for (Book book : books) {
            System.out.println(book.getName() + "-" + book.getYear());
        }

        // Using comparator
        NameComparator nameCompare = new NameComparator();
        Arrays.sort(books, nameCompare);
        for (Book book : books) {
            System.out.println(book.getName() + "-" + book.getYear());
        }

        YearComparator yearComparator = new YearComparator();
        Arrays.sort(books, yearComparator);
        for (Book book : books) {
            System.out.println(book.getName() + "-" + book.getYear());
        }
    }
}
