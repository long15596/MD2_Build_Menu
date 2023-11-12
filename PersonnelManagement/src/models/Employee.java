package models;

public class Employee extends Personnel{
    private String work;
    public Employee() {}

    public Employee(String name, String gender, int age, String address, String work) {
        super(name, gender, age, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Employee: "
                + " ID: " + Employee.this.getId()
                + " Name: " + Employee.this.getName()
                + " Gener: " + Employee.this.getGender()
                + " Age: " + Employee.this.getAge()
                + " Address: " + Employee.this.getAddress()
                + " Work: " + work;
    }
}
