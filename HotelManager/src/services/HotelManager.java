package services;

import models.Customer;

import java.util.ArrayList;
import java.util.List;

public class HotelManager implements GeneralManager{
    private List<Customer> customers;

    public HotelManager() {
        this.customers = new ArrayList<>();
    }
    @Override
    public void add(Object object) {
        customers.add((Customer) object);
    }

    @Override
    public void showAll() {
        for (Customer c: customers) {
            System.out.println(c);
        }
    }

    @Override
    public Object findById(int id) {
        for (Customer c: customers) {
            if(c.getId() == id) {
                return c;
            }
        }
        return "Not found";
    }
    @Override
    public void deleteById(int id) {
        customers.removeIf(c -> c.getId() == id);
    }
}
