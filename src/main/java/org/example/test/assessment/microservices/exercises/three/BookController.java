package org.example.test.assessment.microservices.exercises.three;

import org.example.test.assessment.microservices.exercises.four.repository.BookRepository;
import org.example.test.assessment.microservices.exercises.three.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/v1")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping(value = "/books")
    public ResponseEntity<List<Book>> getAllBooks() {
         List<Book> books = new ArrayList<>();

         return ResponseEntity.ok(books);
    }

    @GetMapping(value = "/book/{isn}")
    public ResponseEntity getBookByISBN(@PathVariable int isnb) {
        Optional<Book> book = Book.buildBooks().stream().filter(b -> b.getIsbn() == isnb).findFirst();

        return book.isPresent()
                        ? new ResponseEntity(book, HttpStatus.OK) : new ResponseEntity(HttpStatus.NOT_FOUND);

    }

    @PostMapping(value = "/book")
    public ResponseEntity<Book> addNewBook(@RequestBody Book book) {
        return ResponseEntity.ok(bookRepository.save(book));
    }
}
