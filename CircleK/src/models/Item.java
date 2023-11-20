package models;

public class Item {
    private int id;
    private Product product;
    private int quantity;
    private static int idIncrement = 1;

    public Item(Product product, int quantity) {
        this.id = idIncrement;
        this.product = product;
        this.quantity = quantity;
        idIncrement++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
    @Override
    public String toString() {
        return "Item ID: " + id + "\n" +
                "Product: " + product + "\n" +
                "Buy Quantity: " + quantity + "\n" +
                "Total Price: " + product.getPrice() + "\n";
    }
}
