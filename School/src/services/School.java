package services;

import models.Student;

import java.util.ArrayList;
import java.util.List;

public class School implements GeneralManager{
    List<Student> students = new ArrayList<>();
    @Override
    public void add(Object o) {
        students.add((Student) o);
    }

    @Override
    public void showAll() {
        for (Student s: students) {
            System.out.println(s);
        }
    }

    @Override
    public Object findById(int id) {
        for (Student s: students) {
            if (s.getId() == id) return s;
        }
        return "Not Found";
    }
    public Object findByAgeAndHomeland(int age, String homeland) {
        for (Student s: students) {
            if (s.getAge() == age || s.getHomeland().equals(homeland)) return s;
        }
        return "Not Found";
    }
    @Override
    public void deleteById(int id) {
        students.removeIf(s -> s.getId() == id);
    }
}
