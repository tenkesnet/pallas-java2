package com.pallas.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

import com.pallas.model.Book;
import com.pallas.model.Person;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Person> persons;

    public Library() {
        books = new ArrayList<Book>();
        books.add(
                new Book(
                        "23423534534",
                        "Kis Herceg",
                        "Kiss Géza",
                        new ArrayList<String>(Arrays.asList("novella")),
                        new GregorianCalendar(1996, 1, 1).getGregorianChange()));
        books.add(
                new Book(
                        "856867867856",
                        "Schindler bárkája",
                        "Nagy Lóránt",
                        new ArrayList<String>(Arrays.asList("regény", "életrajzi")),
                        new GregorianCalendar(1996, 1, 1).getGregorianChange()));
        persons = new ArrayList<Person>();

    }

    public void printBooks() {
        System.out.println("Könyvek listája:");
        for (Book book : books) {
            System.out.println("-" + book.getTitle() + " ( " + String.join(",", book.getGenres()) + " )");
        }
    }
}
