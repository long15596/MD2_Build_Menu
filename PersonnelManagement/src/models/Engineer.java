package models;

public class Engineer extends Personnel{
    private String training;

    public Engineer(String training) {
        this.training = training;
    }

    public Engineer(String name, String gender, int age, String address, String training) {
        super(name, gender, age, address);
        this.training = training;
    }

    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }

    @Override
    public String toString() {
        return "Engineer: "
                + " ID: " + Engineer.this.getId()
                + " Name: " + Engineer.this.getName()
                + " Gener: " + Engineer.this.getGender()
                + " Age: " + Engineer.this.getAge()
                + " Address: " + Engineer.this.getAddress()
                + " Training: " + training;
    }
}
