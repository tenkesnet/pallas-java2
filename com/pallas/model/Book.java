package com.pallas.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Book implements Serializable {
    private static long id;
    private String isbn;
    private String title;
    private String author;
    private ArrayList<String> genres;
    private Date issueDate;
    private Date rentalDate;
    private int state;

    public Book(String isbn, String title, String author, ArrayList<String> genres, Date issueDate) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genres = genres;
        this.issueDate = issueDate;
    }

    public void addGenre(String genre) {
        this.genres.add(genre);
    }

    public ArrayList<String> getGenres() {
        return this.genres;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getIssue() {
        return issueDate;
    }

    public void setIssue(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

}
