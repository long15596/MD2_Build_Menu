package models;

public class Product {
    private int id;
    private String name;
    private int quantity;
    private static int idIncrement = 1;

    public Product(int id, String name, int quantity) {
        this.id = idIncrement;
        this.name = name;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Quantity: " + quantity + "\n";
    }
}
