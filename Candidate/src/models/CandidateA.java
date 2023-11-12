package models;

public class CandidateA extends Candidate{
    private final String MATCH = "Match";
    private final String PHYSICS = "Physíc";
    private final String CHEMISTRY = "Chemistry";

    public CandidateA() {
    }

    public CandidateA(String name, String address, int priority) {
        super(name, address, priority);
    }

    @Override
    public String toString() {
        return "Candidate A: \n" +
                "Student ID: " + CandidateA.this.getId() + "\n" +
                "Name: " + CandidateA.this.getName() + "\n" +
                "Address: " + CandidateA.this.getAddress() + "\n" +
                "Priority: " + CandidateA.this.getPriority() + "\n" +
                "Exam Subject: " + MATCH + ", " + PHYSICS + ", " + CHEMISTRY + "\n";
    }

    public static void main(String[] args) {
        Candidate c1 = new CandidateA("Long", "HN", 2);
        System.out.println(c1);
    }
}
