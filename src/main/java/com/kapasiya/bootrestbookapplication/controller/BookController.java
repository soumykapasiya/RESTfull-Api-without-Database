package com.kapasiya.bootrestbookapplication.controller;


import com.kapasiya.bootrestbookapplication.entity.Book;
import com.kapasiya.bootrestbookapplication.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController
{
    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks()
    {
        return bookService.getAllBooks();
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable("id") int id)
    {
        return bookService.getBookByID(id);
    }

    @PostMapping("/createBook")
    public List<Book> createBook(@RequestBody Book book)
    {
        return bookService.createBook(book);
    }

    @GetMapping("/delete/{id}")
    public List<Book> deleteBook(@PathVariable("id") int id)
    {
        return bookService.deleteBook(id);
    }

    @PutMapping("/update")
    public List<Book> updateBook(@RequestBody Book book)
    {
        return bookService.updateBook(book);
    }

}
