package com.asrihashim.boot_graphql;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    
    @Autowired
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @QueryMapping
    public String version() {
        return "1.0.0";
    }

    @QueryMapping
    public Iterable<Book> books() {
        return bookRepository.findAll();
    }

    @QueryMapping
    public Optional<Book> bookById(@Argument String id) {
        return bookRepository.findById(Long.parseLong(id));
    }

    @MutationMapping
    public Book addBook(@Argument String title, @Argument String author) {
        Book book = new Book(null, title, author);
        return bookRepository.save(book);
    }
}
