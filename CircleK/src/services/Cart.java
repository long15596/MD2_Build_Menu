package services;

import models.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart implements GeneralManager<Item>{
    private int id;
    public static int idIncrement = 1;
    private List<Item> items;
    private String date;
    Scanner inputInt = new Scanner(System.in);
    Scanner intStr  = new Scanner(System.in);
    public Cart(String date) {
        this.id = idIncrement;
        idIncrement++;
        this.date = date;
        items = new ArrayList<>();
    }

    public double getPayment() {
        double sum = 0;
        for (Item item : items) sum += item.getTotalPrice();
        return sum;
    }
    @Override
    public void add(Item obj) {
        items.add(obj);
    }

    @Override
    public void showAll() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
    @Override
    public Item findById(int id) {
        for (Item item : items) {
            if (item.getId() == id) return item;
        }
        return null;
    }

    @Override
    public void update(int id) {
    }

    @Override
    public void delete(int id) {
        for (Item item : items) {
            if (item.getId() == id) items.remove(item);
        }
    }
    @Override
    public String toString() {
        return "Cart Number: " + id + "\n" +
                "Date: " + date + "\n" +
                "Items: " + items + '\n' +
                "Payment: " + getPayment();
    }
}
