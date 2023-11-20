package models;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private int id;
    private static int idIncrement = 1;
    public Customer(String name) {
        this.name = name;
        this.id = idIncrement;
        idIncrement++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
