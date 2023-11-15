package models;

public class Student {
    private int id;
    private String name;
    private int age;
    private String homeland;
    private static int idIncrement = 1;

    public Student(String name, int age, String homeland) {
        this.name = name;
        this.age = age;
        this.homeland = homeland;
        this.id = idIncrement;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeland() {
        return homeland;
    }

    public void setHomeland(String homeland) {
        this.homeland = homeland;
    }

    @Override
    public String toString() {
        return "Student\n" +
                "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Homeland: " + homeland + "\n";
    }
}
