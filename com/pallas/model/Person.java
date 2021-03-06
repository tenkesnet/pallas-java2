package com.pallas.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Person implements Serializable {
    private long id;
    private static long count = 1;

    private String name;
    private String motherName;
    private Date birthday;
    private String phoneNumber;
    private Address address;
    private ArrayList<Book> books;
    private Date membershipDate;
    private double debit;

    public Person() {

    }

    public Person(String name, String motherName, Date birthday, Address address) {
        this.name = name;
        this.motherName = motherName;
        this.birthday = birthday;
        this.address = address;
        this.id = count;
        count++;
    }

    public static long getCount() {
        return count;
    }

    public static void setCount(long count) {
        Person.count = count;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMotherName() {
        return motherName;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getMembershipDate() {
        return membershipDate;
    }

    public void setMembershipDate(Date membershipDate) {
        this.membershipDate = membershipDate;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
