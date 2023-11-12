package models;

public class Worker extends Personnel{
    private int rank;

    public Worker() {}

    public Worker(String name, String gender, int age, String address, int rank) {
        super(name, gender, age, address);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Work: "
                + " ID: " + Worker.this.getId()
                + " Name: " + Worker.this.getName()
                + " Gender: " + Worker.this.getGender()
                + " Age: " + Worker.this.getAge()
                + " Address: " + Worker.this.getAddress()
                + " Rank: " + rank;
    }
}
