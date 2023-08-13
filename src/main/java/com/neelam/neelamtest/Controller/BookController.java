package com.neelam.neelamtest.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neelam.neelamtest.Model.Book;

@RestController
public class BookController {

    @RequestMapping("/neelam/books")
    @GetMapping
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        // Add some dummy books for demonstration purposes
        books.add(new Book(1L, "Book 1", "Author 1", 2022));
        books.add(new Book(2L, "Book 2", "Author 2", 2021));
        books.add(new Book(3L, "Book 3", "Author 3", 2020));
        return books;
    }
}
