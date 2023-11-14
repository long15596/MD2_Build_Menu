package services;

import models.Person;

import java.util.ArrayList;
import java.util.List;

public class Family implements GeneralManager{
    private int houseNumber;
    private static int houseNumberIncrement = 1;
    private int personNumber;
    private List<Person> people;

    public Family() {
        this.houseNumber = houseNumberIncrement;
        personNumber = 0;
        this.people = new ArrayList<>();
        houseNumberIncrement++;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(int personNumber) {
        this.personNumber = personNumber;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    @Override
    public void add(Object object) {
        people.add((Person) object);
        personNumber++;
    }

    @Override
    public void showAll() {
        for (Person p: people) {
            System.out.println(p);
        }
    }

    @Override
    public Object findById(int id) {
        for (Person p: people) {
            if(p.getId() == id) {
                return p;
            }
        }
        return "Not Found";
    }
    @Override
    public void deleteById(int id) {
        people.removeIf(p -> p.getId() == id);
    }
    public void editById(int id, Object object) {
        people.remove(findById(id));
        people.set(id -1, (Person) object);
    }
    @Override
    public String toString() {
        return "House Number: " + houseNumber + "\n"
                + "Person Number=" + personNumber + "\n"
                + "All Person: \n" + people;
    }
}
