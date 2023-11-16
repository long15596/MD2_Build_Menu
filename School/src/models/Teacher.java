package models;

public class Teacher {
    private int id;
    private String name;
    private String subject;
    private Double salary;
    private static int idIncrement = 1;

    public Teacher(String name, String subject, Double salary) {
        this.id = idIncrement;
        this.name = name;
        this.subject = subject;
        this.salary = salary;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher ID: " + id  + "\n" +
                "Name: " + name + "\n" +
                "Subject Teaching: " + subject + "\n" +
                "Salary: " + salary + "\n";
    }
}
