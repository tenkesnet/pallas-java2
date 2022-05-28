package com.pallas.repository;

import java.util.ArrayList;

import com.pallas.model.Person;

public interface IPerson {
    public ArrayList<Person> getPersons();

    public Person getPerson();
}
