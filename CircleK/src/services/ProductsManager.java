package services;

import models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductsManager implements GeneralManager<Product>{
    private List<Product> products = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    @Override
    public void add(Product obj) {
        products.add(obj);
    }

    @Override
    public void showAll() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if (id == product.getId()) return product;
        }
        return null;
    }

    @Override
    public void update(int id) {
        Product product = findById(id);
        System.out.println("Enter New Name");
        String name = input.nextLine();
        product.setName(name);
        System.out.println("Enter New Price");
        double price = input.nextDouble();
        product.setPrice(price);
        System.out.println("Enter New Quantity");
        int quantity = input.nextInt();
        product.setQuantity(quantity);
        System.out.println("Update Success");
    }

    @Override
    public void delete(int id) {
        for (Product product : products) {
            if (id == product.getId()) products.remove(product);
        }
    }
    public Product findByPrice(double price) {
        for (Product p: products) {
            if (p.getPrice() == price) return p;
        }
        return null;
    }
    public Product findByName(String name) {
        for (Product p: products) {
            if (p.getName().contains(name)) return p;
        }
        return null;
    }
}
