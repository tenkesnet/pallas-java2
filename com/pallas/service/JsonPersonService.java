package com.pallas.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pallas.model.Address;
import com.pallas.model.Person;

public class JsonPersonService implements IPersonService {

    @Override
    public ArrayList<Person> getPersons() {
        ArrayList<Person> persons = null;
        String jsonText = "";
        try {
            jsonText = Files.readString(Paths.get("persons.json"));
        } catch (Exception e) {
            // TODO: handle exception
        }

        ObjectMapper objectMapper = new ObjectMapper();

        try {

            persons = objectMapper.readValue(jsonText,
                    new TypeReference<ArrayList<Person>>() {
                    });

        } catch (IOException e) {
            e.printStackTrace();
        }
        return persons;
    }

    @Override
    public void addPersons(ArrayList<Person> persons) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("persons.json"), persons);
        } catch (StreamWriteException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (DatabindException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

    }

    @Override
    public void addPerson(Person persons) {
        // TODO Auto-generated method stub

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
