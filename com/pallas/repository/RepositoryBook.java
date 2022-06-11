package com.pallas.repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.pallas.model.Book;
import com.pallas.service.IBookService;
import com.pallas.service.IPersonService;

public class RepositoryBook implements IRepositoryBook {
    private ArrayList<Book> books;
    private IBookService bookservice;

    public RepositoryBook(IBookService bookservice) {
        this.bookservice = bookservice;
        if ((books = bookservice.getBooks()) == null) {
            books = new ArrayList<Book>();
        }
    }

    @Override
    public ArrayList<Book> getBooks() {
        return books;
    }

    @Override
    public Book getBook(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Book getBook(String isbn) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addBook(Book book) {
        boolean isExists = false;
        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())) {
                isExists = true;
            }
        }
        if (!isExists) {
            books.add(book);
            saveBooks();
        }
    }

    @Override
    public void saveBooks() {
        bookservice.addBooks(books);

    }

}
