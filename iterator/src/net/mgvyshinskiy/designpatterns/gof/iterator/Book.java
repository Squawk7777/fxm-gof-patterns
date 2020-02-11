package net.mgvyshinskiy.designpatterns.gof.iterator;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private LocalDate date;

    public Book(String title, String author, LocalDate date) {
        this.title = title;
        this.author = author;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getDate() {
        return date;
    }
}
