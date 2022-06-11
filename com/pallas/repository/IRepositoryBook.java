package com.pallas.repository;

import java.util.ArrayList;

import com.pallas.model.Book;

public interface IRepositoryBook {
    public ArrayList<Book> getBooks();

    public Book getBook(int id);

    public Book getBook(String isbn);

    public void addBook(Book Book);

    public void saveBooks();
}
