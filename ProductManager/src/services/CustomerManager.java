package services;


import models.Customer;
import models.Exception;
import models.Product;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    List<Customer> customers = new ArrayList<>();
    Exception exception = new Exception();
    public void add(Customer customer) {
        customers.add(customer);
    }
    public Customer findById(int id) {
        for (Customer c: customers) {
            if (c.getId() == id) return c;
        }
        return null;
    }
    public void addProductToCart(ProductManager productManager, Customer customer) {
        System.out.println("Enter Product Id");
        int findId = exception.choiceException();
        Product product = productManager.findById(findId);
        System.out.println(product);
        if (product != null) {
            System.out.println("Enter Buy Quantity");
            int buyQuantity = exception.choiceException();
            if(product.getQuantity() >= buyQuantity) {
                System.out.println(customer.getName() + " buy " + product.getName() + " quantity: " + buyQuantity);
                System.out.println("Add Success");
                product.setQuantity(product.getQuantity() - buyQuantity);
            } else System.out.println("Quantity Not Enough");
        } else System.out.println("Not Found");
    }
}
