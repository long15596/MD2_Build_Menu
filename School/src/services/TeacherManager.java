package services;

import models.Teacher;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TeacherManager implements GeneralManager<Teacher, Integer>{
    List<Teacher> teachers = new ArrayList<>();
    @Override
    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void showAll() {
        for (Teacher teacher: teachers) {
            System.out.println(teacher);
        }
    }

    @Override
    public Teacher findById(Integer id) {
        for (Teacher teacher: teachers) {
            if (teacher.getId() == id) return teacher;
        }
        return null;
    }

    @Override
    public void deleteById(Integer id) {
        teachers.removeIf(teacher -> teacher.getId() == id);
    }

    @Override
    public void edit(Integer id, Teacher teacher) {
        teachers.set(id, teacher);
    }
    public void findBySubject(String subject) {
        for (Teacher teacher: teachers) {
            if (teacher.getSubject().equals(subject)) System.out.println(teacher);
        }
    }
    public void sortBySalary() {
        List<Teacher> sortList = new LinkedList<>(teachers);
        sortList.sort((t1, t2) -> Double.compare(t2.getSalary(), t1.getSalary()));
        System.out.println(sortList);
    }
}
