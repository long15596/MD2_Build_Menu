package services;

import models.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class StudentManager implements GeneralManager<Student, Integer>{
    List<Student> students = new ArrayList<>();
    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public void showAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public Student findById(Integer id) {
        for (Student student : students){
            if (student.getId() == id) return student;
        }
        return null;
    }

    @Override
    public void deleteById(Integer id) {
        students.removeIf(student -> student.getId() == id);
    }

    @Override
    public void edit(Integer id, Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (student.getId() == id) {
                students.add(i, student);
            }
        }
    }
    public void showStudentInfo() {
        for (Student student: students) {
            System.out.println("Student ID: " + student.getId() + "\n"
                    + "Name: " + student.getName() + "\n"
                    + "Grade Point Average: " + student.getGpa());
        }
    }
    public void showExcellentStudents() {
        for (Student student: students) {
            if (student.getGpa() > 8.5 && student.getMatch() > 8 && student.getChemistry() > 8 && student.getPhysical() > 8) {
                System.out.println(student + "\n Excellent Student" );
            }

        }
    }
    public void showAverageStudents() {
        for (Student student: students)
            if (student.getGpa() >= 5.5 && student.getMatch() > 5 && student.getChemistry() > 5 && student.getPhysical() > 5) {
                System.out.println(student + "\n Be Promoted To Class");
            }
    }
    public void showFailStudents() {
        for (Student student: students) {
            if (student.getGpa() <= 5.5 && student.getMatch() < 5 && student.getChemistry() < 5 && student.getPhysical() < 5) {
                System.out.println(student + "\n Fail Student");
            }
        }
    }
}
