package org.example.test.assessment.microservices.exercises.three.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String title;
    private String authorName;
    private Long isbn;
    @Column(name = "published_date")
    private Date datePublished;
    private LocalTime createdAt;

    public Book(int id, String title, String authorName, Long isbn, LocalDate datePublished) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.isbn = isbn;
        this.datePublished = new Date();
        this.createdAt = LocalTime.now();
    }

    public Book() {
    }

    public static List<Book> buildBooks() {
        Book book = new Book(1, "Book 1", "Author 1",  199L, LocalDate.now());
        Book book2 = new Book( 2, "Book 2", "Author 2", 1987L, LocalDate.now());
        Book book3 = new Book( 3, "Book 3", "Author 3", 19192L, LocalDate.now());

        List<Book> books = new ArrayList<>();

        books.add(book);
        books.add(book2);
        books.add(book3);

        return books;
    }
}
