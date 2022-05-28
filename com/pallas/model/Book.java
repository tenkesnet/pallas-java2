package com.pallas.model;

import java.util.ArrayList;
import java.util.Date;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private ArrayList<String> genres;
    private Date issue;
    private Date rentalDate;
    private int state;

    public Book(String isbn, String title, String author, ArrayList<String> genres, Date issue) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genres = genres;
        this.issue = issue;
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
        return issue;
    }

    public void setIssue(Date issue) {
        this.issue = issue;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

}
