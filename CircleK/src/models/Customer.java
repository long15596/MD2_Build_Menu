package models;

import services.Cart;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private static int idIncrement = 1;
    private List<Cart> carts;

    public Customer(String name) {
        this.id = idIncrement;
        idIncrement++;
        this.name = name;
        this.carts = new ArrayList<>();
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

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

    @Override
    public String toString() {
        return "Customer ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Carts: " + carts + "\n";
    }
}
