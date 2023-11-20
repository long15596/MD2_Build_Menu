package models;

public class Student {
    private int id;
    private String name;
    private Double match;
    private Double physical;
    private Double chemistry;
    private static int idIncrement = 1;

    public Student() {
    }

    public Student(String name, Double match, Double physical, Double chemistry) {
        this.id = idIncrement++;
        this.name = name;
        this.match = match;
        this.physical = physical;
        this.chemistry = chemistry;
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

    public Double getMatch() {
        return match;
    }

    public void setMatch(Double match) {
        this.match = match;
    }

    public Double getPhysical() {
        return physical;
    }

    public void setPhysical(Double physical) {
        this.physical = physical;
    }

    public Double getChemistry() {
        return chemistry;
    }

    public void setChemistry(Double chemistry) {
        this.chemistry = chemistry;
    }
    public Double getGpa(){
        return (match + physical + chemistry) / 3;
    }
    @Override
    public String toString() {
        return "Student Id: " + id + "\n" +
                "Name " + name + "\n" +
                "Physical: " + physical + "\n" +
                "Chemistry: " + chemistry + "\n" +
                "Match: " + match + "\n" +
                "Grade Point Average: " + getGpa() + "\n";
    }
}
