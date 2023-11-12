package services;

import dto.ReadAndWrite;
import models.Student;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentManager {
    private List<Student> listStudent;
    private int size;
    public StudentManager(){
      this.size = 0;
      this.listStudent = ReadAndWrite.readFile("listStudents.csv");
    }
    public void addStudent(Student student) {
        this.listStudent.add(size, student);
        ReadAndWrite.writeFile(listStudent, "listStudents.csv");
        size++;
    }
    public void edit(int id, Student student) {
       this.listStudent.add(id, student);
    }
    public boolean delete(int id) {
        Student student = findStudentById(id);
        if (student != null) {
            listStudent.remove(id);
            ReadAndWrite.writeFile(listStudent, "listStudents.csv");
            return true;
        } else {
            return false;
        }
    }

    public List<Student> getListStudent() {
        return this.listStudent;
    }
    public Student findStudentById(int id) {
        for (Student student: listStudent) {
            if(id == student.getId()) {
                return student;
            }
        }
        return null;
    }

}
