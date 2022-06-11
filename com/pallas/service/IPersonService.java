package com.pallas.service;

import java.util.ArrayList;

import com.pallas.model.Address;
import com.pallas.model.Person;

public interface IPersonService {
    public ArrayList<Person> getPersons();

    public void addPersons(ArrayList<Person> persons);

    public void addPerson(Person persons);

    public Person getPerson(long id);

    public Person getPerson(String name, String motherName);

    public void changeAddress(Person person, Address address);

}
