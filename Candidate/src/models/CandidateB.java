package models;

public class CandidateB extends Candidate{
    private final String MATCH = "Match";
    private final String BIOLOGY = "Biology";
    private final String CHEMISTRY = "Chemistry";

    public CandidateB() {
    }

    public CandidateB(String name, String address, int priority) {
        super(name, address, priority);
    }

    @Override
    public String toString() {
        return "Candidate B: \n" +
                "Student ID: " + CandidateB.this.getId() + "\n" +
                "Name: " + CandidateB.this.getName() + "\n" +
                "Address: " + CandidateB.this.getAddress() + "\n" +
                "Priority: " + CandidateB.this.getPriority() + "\n" +
                "Exam Subject: " + MATCH + ", " + BIOLOGY + ", " + CHEMISTRY + "\n";

    }
}
