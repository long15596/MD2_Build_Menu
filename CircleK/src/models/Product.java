package models;

public class Product {
    private int id;
    private static int idIncrement = 1;
    private String name;
    private double price;
    private int quantity;
    private Category category;

    public Product(String name, double price, int quantity, Category category) {
        this.id = idIncrement;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Category: " + category + "\n" +
                "Price: " + price + "\n" +
                "Quantity: " + quantity + "\n";
    }
}
