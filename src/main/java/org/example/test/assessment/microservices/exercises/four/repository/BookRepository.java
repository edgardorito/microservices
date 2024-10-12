package org.example.test.assessment.microservices.exercises.four.repository;

import org.example.test.assessment.microservices.exercises.three.entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface BookRepository extends CrudRepository<Book, Long> {

    public Book findByAuthorName(String author);

    public Book findByDatePublished(Date date);

}
