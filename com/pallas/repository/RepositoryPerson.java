package com.pallas.repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import com.pallas.model.Address;
import com.pallas.model.Person;
import com.pallas.service.IPersonService;

public class RepositoryPerson implements IRepositoryPerson {
    private ArrayList<Person> persons;
    private IPersonService personservice;

    public RepositoryPerson(IPersonService personservice) {
        this.personservice = personservice;
        if ((persons = personservice.getPersons()) == null) {
            persons = new ArrayList<Person>();
        }
    }

    @Override
    public ArrayList<Person> getPersons() {
        return persons;
    }

    @Override
    public Person getPerson(long id) {
        return personservice.getPerson(id);
    }

    @Override
    public Person getPerson(String name, String motherName) {
        Person result = personservice.getPerson(name, motherName);
        if (result == null) {
            Person ismeretlen = new Person("Ismeretlen személy",
                    "Isemeretlen",
                    Date.from(new GregorianCalendar(1000, 0, 1)
                            .toInstant()),
                    new Address("Ismeretlen", "Ismeretlen", "Ismeretlen"));
            return ismeretlen;
        }
        return result;
    }

    @Override
    public void addPerson(Person person) {
        boolean isExists = false;
        for (Person p : persons) {
            if (p.getName().equals(person.getName()) && p.getMotherName().equals(person.getMotherName())) {
                isExists = true;
            }
        }
        if (!isExists) {
            persons.add(person);
            savePersons();
        }
    }

    @Override
    public void savePersons() {
        personservice.addPersons(persons);

    }

    @Override
    public void changeAddress(Person person, Address address) {
        personservice.changeAddress(person, address);

    }
}
