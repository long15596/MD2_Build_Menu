package dto;

import models.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReadAndWrite {
    public static void writeFile(List<Student> studentList) {
        File file = new File("listStudents.csv");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Student s: studentList) {
                    bufferedWriter.write(s.getId() + ", "
                            + s.getName() + ", "
                            + s.getGender() + ", "
                            + s.getPoints() + ", "
                            + s.getAvg() + "\n");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public static List<String[]> readFile(String linkFile) {

    }
}
