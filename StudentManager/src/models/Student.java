package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private int id;
    private static int idIncrement;
    private String name;
    private String gender;
    private List<Double> points;

    public Student(String name, String gender, List<Double> points) {
        this.id = idIncrement;
        this.name = name;
        this.gender = gender;
        this.points = points;
        idIncrement++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Double> getPoints() {
        return points;
    }

    public void setPoints(List<Double> points) {
        this.points = points;
    }
    public double getAvg() {
        double sum = 0;
        for (Double point: points) {
           sum += point;
        }
        return sum / points.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "Mã học sinh: " + id +
                ", Tên: " + name + '\'' +
                ", Giới tính: " + gender + '\'' +
                ", Điểm Toán: " + points.get(0) +
                ", Điểm Văn: " + points.get(1) +
                ", Điểm Anh: " + points.get(2) +
                ", Điểm trung bình: " + getAvg() +
                '}';
    }
}
