package com.pallas.service;

import java.util.ArrayList;

import com.pallas.model.Person;

public interface IPersonService {
    public ArrayList<Person> getPersons();

    public void addPersons(ArrayList<Person> persons);

    public void addPerson(Person persons);

    public Person getPerson(int id);

    public Person getPerson(String name, String motherName);

}
