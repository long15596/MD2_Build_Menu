package models;

public class Customer {
    private int id;
    private String name;
    private int age;
    private Room room;
    private double dayRent;
    private static int idIncrement = 1;

    public Customer(String name, int age, Room room, double dayRent) {
        this.id = idIncrement;
        this.name = name;
        this.age = age;
        this.room = room;
        this.dayRent = dayRent;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public double getDayRent() {
        return dayRent;
    }

    public void setDayRent(double dayRent) {
        this.dayRent = dayRent;
    }
    public double grossRent() {
        return dayRent * room.getPrice();
    }
    @Override
    public String toString() {
        return "Customer: \n" +
                "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Room: " + room + "\n" +
                "Day Rent: " + dayRent + "\n";
    }
}
