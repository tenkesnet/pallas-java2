package com.pallas.service;

import java.util.ArrayList;

import com.pallas.model.Book;
import com.pallas.model.Person;

public interface IBookService {
    public ArrayList<Book> getBooks();

    public void addBooks(ArrayList<Book> books);

    public void addBook(Person books);

    public Person getBook(int id);

    public Person getBook(String isbn);

}
