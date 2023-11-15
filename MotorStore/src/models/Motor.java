package models;

public class Motor {
    private int id;
    private String name;
    private double price;
    private int cc;
    private static int idIncrement = 1;

    public Motor(String name, double price, int cc) {
        this.id = idIncrement++;
        this.name = name;
        this.price = price;
        this.cc = cc;
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

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Motor: \n" +
                "Id: " + id + "\n"+
                "Name: " + name + "\n" +
                "Price: " + price + "$\n" +
                "CC: " + cc + "\n";
    }
}
