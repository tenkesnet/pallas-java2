package com.pallas.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import com.pallas.model.Book;
import com.pallas.model.Person;

public class ObjectBookService implements IBookService {

    @Override
    public ArrayList<Book> getBooks() {
        ArrayList<Book> books = null;
        try {
            FileInputStream fis = new FileInputStream("books.db");
            ObjectInputStream ois = new ObjectInputStream(fis);

            books = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (Exception e) {
            return null;
        }
        return books;
    }

    @Override
    public void addBooks(ArrayList<Book> books) {
        try {
            Files.deleteIfExists(Path.of("books.db"));
            FileOutputStream fos = new FileOutputStream("books.db", false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(books);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    @Override
    public Person getBook(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Person getBook(String isbn) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addBook(Book book) {
        // TODO Auto-generated method stub

    }

}
