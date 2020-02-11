package net.mgvyshinskiy.designpatterns.gof.iterator;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorApp {
    public static void main(String[] args) {
        Book bookOne = new Book("The Lord of the Rings", "Tolkien J. R. R.", LocalDate.ofYearDay(1954, 1));
        Book bookTwo = new Book("The Little Prince", "Exupery Antoine de Saint", LocalDate.ofYearDay(1943, 1));
        Book bookThree = new Book("The Master and Margarita", "Bulgakov Mikhail", LocalDate.ofYearDay(1967, 1));
        Book bookFour = new Book("Alice's Adventures in Wonderland", "Carroll Lewis", LocalDate.ofYearDay(1865, 1));
        Book bookFive = new Book("And Then There Were None", "Christie Agatha", LocalDate.ofYearDay(1939, 1));

        List<Book> books = Arrays.asList(bookOne, bookTwo, bookThree, bookFour, bookFive);

        Iterator<Book> titleIterator = BookIteratorUtil.getTitleIterator(books);
        Iterator<Book> authorIterator = BookIteratorUtil.getAuthorIterator(books);
        Iterator<Book> yearIterator = BookIteratorUtil.getYearIterator(books);

        System.out.println(titleIterator.next().getTitle());
        System.out.println(titleIterator.next().getTitle());
        System.out.println(titleIterator.next().getTitle());

        System.out.println("-------------------------------");

        System.out.println(authorIterator.next().getAuthor());
        System.out.println(authorIterator.next().getAuthor());
        System.out.println(authorIterator.next().getAuthor());

        System.out.println("-------------------------------");

        System.out.println(yearIterator.next().getDate().getYear());
        System.out.println(yearIterator.next().getDate().getYear());
        System.out.println(yearIterator.next().getDate().getYear());
    }
}
