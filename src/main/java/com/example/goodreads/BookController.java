package com.example.goodreads;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import com.example.goodreads.BookService;
import com.example.goodreads.Book;

@RestController
public class BookController {
    BookService bookservice = new BookService();

    @GetMapping("/books")
    public ArrayList<Book> getBooks() {
        return bookservice.getBooks();
    }
}