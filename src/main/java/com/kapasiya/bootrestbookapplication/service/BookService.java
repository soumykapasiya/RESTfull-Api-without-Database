package com.kapasiya.bootrestbookapplication.service;

import com.kapasiya.bootrestbookapplication.entity.Book;
import com.kapasiya.bootrestbookapplication.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService implements BookServiceDef
{
    @Autowired
    BookRepo repo;

    private static final List<Book> books = new ArrayList<>();

    static {
        books.add(new Book(102,"patel","patel world"));
        books.add(new Book(103,"XYZ","XYZ"));
        books.add(new Book(104,"ABC","ABC"));
    }


    @Override
    public List<Book> getAllBooks()
    {
        return  books;
    }

    public Book getBookByID(int id)
    {
        Book book = null;
        book = books.stream().filter(e->e.getId()==id).findFirst().get();

        return  book;
    }

    public List<Book> createBook(Book book)
    {
        books.add(book);
        return books;
    }

    public List<Book> deleteBook(int id)
    {
        Book book = null;
        book = books.stream().filter(e->e.getId()==id).findFirst().get();
        books.remove(book);
        return books;
    }

    public List<Book> updateBook(Book book)
    {
        Book listbook = null;
        listbook = books.stream().filter(e->e.getId()==book.getId()).findFirst().get();

        listbook.setName(book.getName());
        listbook.setAuthor(book.getAuthor());

        return books;

    }
}
