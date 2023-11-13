package models;

public class Person {
    private int id;
    private String name;
    private int age;
    private String profession;
    private static int idIncrement = 1;

    public Person() {
    }

    public Person(String name, int age, String profession) {
        this.id = idIncrement;
        this.name = name;
        this.age = age;
        this.profession = profession;
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Person:\n" +
                "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Profession: " + profession + "\n";
    }

    public static void main(String[] args) {
        Person person = new Person("Long", 27, "Thất Nghiệp");
        System.out.println(person);
    }
}
