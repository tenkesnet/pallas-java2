package com.pallas.service;

import java.util.ArrayList;

import com.pallas.model.Book;
import com.pallas.model.Person;

public interface IBookService {
    public ArrayList<Book> getBooks();

    public void addBooks(ArrayList<Book> books);

    public void addBook(Book book);

    public Book getBook(int id);

    public Book getBook(String isbn);

}
