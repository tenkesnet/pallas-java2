package com.pallas.repository;

import java.util.ArrayList;

import com.pallas.model.Person;

public interface IRepositoryPerson {
    public ArrayList<Person> getPersons();

    public Person getPerson(int id);

    public Person getPerson(String name, String motherName);
}
