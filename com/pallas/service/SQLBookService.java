package com.pallas.service;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Arrays;

import com.pallas.model.Book;

public class SQLBookService implements IBookService {

    private Connection c;

    public SQLBookService(Connection c) {
        super();
        this.c = c;
    }

    @Override
    public ArrayList<Book> getBooks() {
        ArrayList<Book> books = new ArrayList<Book>();
        String sql = "select * from book";

        try {
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()) {
                Book book = new Book();
                if (rs.getString("genres") != null) {
                    book = new Book(rs.getString("isbn"), rs.getString("title"), rs.getString("author"),
                            new ArrayList<String>(Arrays.asList(rs.getString("genres").split(","))),
                            rs.getDate("issue_date"));
                } else {
                    book = new Book(rs.getString("isbn"), rs.getString("title"), rs.getString("author"),
                            new ArrayList<String>(),
                            rs.getDate("issue_date"));
                }

                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        return books;
    }

    @Override
    public void addBooks(ArrayList<Book> books) {
        // TODO Auto-generated method stub

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
        // TODO Auto-generated method stub
        return null;
    }

}
