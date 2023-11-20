package services;

import models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    List<Product> productList = new ArrayList<>();
    public ProductManager() {
        productList.add(new Product(1, "a", 10));
        productList.add(new Product(2, "b", 10));
        productList.add(new Product(3, "c", 10));
        productList.add(new Product(4, "d", 10));
        productList.add(new Product(5, "e", 10));
        productList.add(new Product(6, "f", 10));
        productList.add(new Product(7, "g", 10));
        productList.add(new Product(8, "h", 10));
        productList.add(new Product(9, "i", 10));
        productList.add(new Product(10, "k", 10));
    }
    public void add(Product product) {
        productList.add(product);
    }
    public void showAll() {
        for (Product p: productList) System.out.println(p);
    }
    public Product findById(int id) {
        for (Product p: productList)
            if (p.getId() == id) return p;
        return null;
    }
    public Product findByName(String name) {
        for (Product p: productList) {
            if (p.getName().contains(name)) return p;
        }
        return null;
    }
    public void removeById(int id) {
        productList.removeIf(p -> p.getId() == id);
    }
}
