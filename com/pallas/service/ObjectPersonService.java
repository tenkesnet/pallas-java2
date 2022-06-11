package com.pallas.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import com.pallas.model.Address;
import com.pallas.model.Person;

public class ObjectPersonService implements IPersonService {

    @Override
    public ArrayList<Person> getPersons() {
        ArrayList<Person> persons = null;
        try {
            FileInputStream fis = new FileInputStream("persons.db");
            ObjectInputStream ois = new ObjectInputStream(fis);

            persons = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (Exception e) {
            return null;
        }
        long maxid = 0;
        for (Person p : persons) {
            if (p.getId() > maxid) {
                maxid = p.getId();
            }
        }
        Person.setCount(maxid + 1);
        return persons;
    }

    @Override
    public Person getPerson(long id) {
        Person result = null;
        ArrayList<Person> persons = getPersons();
        for (Person p : persons) {
            if (p.getId() == id) {
                result = p;
            }
        }
        return result;
    }

    @Override
    public Person getPerson(String name, String motherName) {
        Person result = null;
        ArrayList<Person> persons = getPersons();
        for (Person p : persons) {
            if (p.getName().equals(name) && p.getMotherName().equals(motherName)) {
                result = p;
            }
        }
        return result;

    }

    @Override
    public void addPersons(ArrayList<Person> persons) {
        try {
            Files.deleteIfExists(Path.of("persons.db"));
            FileOutputStream fos = new FileOutputStream("persons.db", false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(persons);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    @Override
    public void addPerson(Person persons) {
        // TODO Auto-generated method stub

    }

    @Override
    public void changeAddress(Person person, Address address) {
        ArrayList<Person> persons = getPersons();
        for (Person p : persons) {
            if (p.getId() == person.getId()) {
                p.setAddress(address);
            }
        }
        addPersons(persons);

    }

}
