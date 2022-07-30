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

    public Book() {

    }

    public Book(String isbn, String title, String author, ArrayList<String> genres, Date issueDate) {
        this.isbn = isbn == null ? "" : isbn;
        this.title = title == null ? "" : title;
        this.author = author == null ? "" : title;
        this.genres = genres;
        this.issueDate = issueDate;
    }

    public void addGenre(String genre) {
        this.genres.add(genre);
    }

    public ArrayList<String> getGenres() {
        /*
         * if(this.genres==null){
         * result = new Arraylist<String>
         * } else {
         * result = this.genres;
         * }
         */
        ArrayList<String> result = this.genres == null ? new ArrayList<String>() : this.genres;
        return result;
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
        return issueDate == null ? new Date() : this.issueDate;
    }

    public void setIssue(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getRentalDate() {
        return rentalDate == null ? new Date() : this.rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Book.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

}
