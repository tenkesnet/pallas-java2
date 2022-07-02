package com.pallas.service;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pallas.model.Book;

public class JsonBookService implements IBookService {

    @Override
    public ArrayList<Book> getBooks() {
        ArrayList<Book> books = null;
        String jsonText = "";
        try {
            jsonText = Files.readString(Paths.get("books.json"));
        } catch (Exception e) {
            // TODO: handle exception
        }

        ObjectMapper objectMapper = new ObjectMapper();

        try {

            books = objectMapper.readValue(jsonText,
                    new TypeReference<ArrayList<Book>>() {
                    });

        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public void addBooks(ArrayList<Book> books) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("books.json"), books);
        } catch (StreamWriteException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (DatabindException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    @Override
    public void addBook(Book book) {
        // TODO Auto-generated method stub

    }

    @Override
    public Book getBook(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Book getBook(String isbn) {
        Book result = null;
        ArrayList<Book> books = getBooks();
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                result = b;
            }
        }
        return result;
    }

}
