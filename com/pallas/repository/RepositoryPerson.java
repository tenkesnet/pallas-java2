package com.pallas.repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.pallas.model.Person;
import com.pallas.service.IPersonService;

public class RepositoryPerson implements IRepositoryPerson {
    private ArrayList<Person> persons;
    private IPersonService personservice;

    public RepositoryPerson(IPersonService personservice) {
        if ((persons = personservice.getPersons()) == null) {
            persons = new ArrayList<Person>();
        }
    }

    @Override
    public ArrayList<Person> getPersons() {
        return persons;
    }

    @Override
    public Person getPerson(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Person getPerson(String name, String motherName) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addPerson(Person person) {
        for (Person p : persons) {
            if (p.getName() == person.getName() && p.getMotherName() == person.getMotherName()) {
                return;
            }
        }
        persons.add(person);
        savePersons();
    }

    @Override
    public void savePersons() {
        personservice.addPersons(persons);

    }

}
