package com.pallas.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.pallas.model.Address;
import com.pallas.model.Book;
import com.pallas.model.Person;
import com.pallas.repository.IRepositoryBook;
import com.pallas.repository.IRepositoryPerson;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Person> persons;
    private IRepositoryPerson personrepo;
    private IRepositoryBook bookrepo;

    public Library(IRepositoryPerson personrepo, IRepositoryBook bookrepo) {
        this.personrepo = personrepo;
        this.bookrepo = bookrepo;

        bookrepo.addBook(
                new Book(
                        "I23423534534",
                        "Kis Lovag",
                        "Kiss Géza",
                        new ArrayList<String>(Arrays.asList("novella")),
                        Date.from(new GregorianCalendar(1996, 1, 1).toInstant())));
        bookrepo.addBook(
                new Book(
                        "856867867856",
                        "Schindler bárkája",
                        "Nagy Lóránt",
                        new ArrayList<String>(Arrays.asList("regény", "életrajzi")),
                        Date.from(new GregorianCalendar(1996, 1, 1).toInstant())));
        books = bookrepo.getBooks();
        personrepo.addPerson(
                new Person(
                        "Kiss Gézá",
                        "Szűcs Irén",
                        Date.from(new GregorianCalendar(1983, 1, 13).toInstant()),
                        new Address("city", "postalCode", "street")));
        personrepo.addPerson(
                new Person(
                        "Kiss Evelin",
                        "Szűcs Irén",
                        Date.from(new GregorianCalendar(1988, 11, 31).toInstant()),
                        new Address("city", "postalCode", "street")));
        persons = personrepo.getPersons();
    }

    public void printBooks() {
        System.out.println("Könyvek listája:");
        for (Book book : books) {
            System.out.println(
                    "-" + book.getTitle() + " ( " + String.join(",", book.getGenres()) + " ) - ISBN: "
                            + book.getIsbn());
        }
    }

    public void printRentals() {
        System.out.println("Tagok listája:");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        for (Person person : persons) {
            System.out.println("-" + person.getName() + " ( " + format.format(person.getBirthday()) + " )");
        }
    }

    public Book getBook(String isbn) {
        Book book = bookrepo.getBook(isbn);
        if (book != null) {
            return book;
        }
        {
            return new Book("Nem ismert", "Nem ismert", "Nem ismert", null, null);
        }
    }

    public String personsToJSON() {
        Gson gson = new Gson();
        return gson.toJson(persons);
    }
}
