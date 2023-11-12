package models;

public class Personnel {
    private int id;
    private String name;
    private String gender;
    private int age;
    private String address;
    private static int idIncrement = 1;
    public Personnel(){};

    public Personnel(String name, String gender, int age, String address) {
        this.id = idIncrement;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String andress) {
        this.address = andress;
    }

    @Override
    public String toString() {
        return "Personnel: " +
                " Id: " + id +
                ", Name: '" + name + '\'' +
                ", Gender: '" + gender + '\'' +
                ", Age: " + age +
                ", Address: '" + address + '\'';
    }
}
