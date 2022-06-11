package com.pallas.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Person> persons;

    public Library() {
        books = new ArrayList<Book>();
        // books.add(
        // new Book(
        // "23423534534",
        // "Kis Herceg",
        // "Kiss Géza",
        // new ArrayList<String>(Arrays.asList("novella")),
        // Date.from(new GregorianCalendar(1996, 1, 1).toInstant())));
        // books.add(
        // new Book(
        // "856867867856",
        // "Schindler bárkája",
        // "Nagy Lóránt",
        // new ArrayList<String>(Arrays.asList("regény", "életrajzi")),
        // Date.from(new GregorianCalendar(1996, 1, 1).toInstant())));
        booksFromFile();
        persons = new ArrayList<Person>();
        persons.add(
                new Person(
                        "Kiss Géza",
                        "Szűcs Irén",
                        Date.from(new GregorianCalendar(1983, 1, 13).toInstant()),
                        new Address("city", "postalCode", "street")));
        persons.add(
                new Person(
                        "Kiss Evelin",
                        "Szűcs Irén",
                        Date.from(new GregorianCalendar(1988, 11, 31).toInstant()),
                        new Address("city", "postalCode", "street")));
    }

    public void printBooks() {
        System.out.println("Könyvek listája:");
        for (Book book : books) {
            System.out.println("-" + book.getTitle() + " ( " + String.join(",", book.getGenres()) + " )");
        }
    }

    public void printRentals() {
        System.out.println("Tagok listája:");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        for (Person person : persons) {
            System.out.println("-" + person.getName() + " ( " + format.format(person.getBirthday()) + " )");
        }
    }

    public void booksToFile() {
        try {
            FileOutputStream fos = new FileOutputStream("books.db");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(books);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void booksFromFile() {
        try {
            FileInputStream fis = new FileInputStream("books.db");
            ObjectInputStream ois = new ObjectInputStream(fis);

            books = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
    }

    public String personsToJSON() {
        Gson gson = new Gson();
        return gson.toJson(persons);
    }
}
