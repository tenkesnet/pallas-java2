package com.pallas.repository;

import java.util.ArrayList;

import com.pallas.model.Address;
import com.pallas.model.Person;

public interface IRepositoryPerson {
    public ArrayList<Person> getPersons();

    public Person getPerson(long id);

    public Person getPerson(String name, String motherName);

    public void addPerson(Person person);

    public void changeAddress(Person person, Address address);

    public void savePersons();
}
