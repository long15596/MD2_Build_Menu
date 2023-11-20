package models;

public class Category {
    private int id;
    private String name;
    private static int idIncrement = 1;

    public Category(String name) {
        this.id = idIncrement;
        this.name = name;
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

    @Override
    public String toString() {
        return "Category ID: " + id + "\n" +
                "Name: " + name + "\n";
    }
}
