package models;

public class Candidate {
    private int id;
    private String name;
    private String address;
    private int priority;
    private static int idIncrement = 1;

    public Candidate() {
    }

    public Candidate(String name, String address, int priority) {
        this.id = idIncrement;
        this.name = name;
        this.address = address;
        this.priority = priority;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

}
