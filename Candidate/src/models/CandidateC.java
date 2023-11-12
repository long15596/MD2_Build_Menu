package models;

public class CandidateC extends Candidate{
    private final String LITERARY = "Literary";
    private final String HISTORY = "History";
    private final String AGENT = "Agent";

    public CandidateC() {
    }

    public CandidateC(String name, String address, int priority) {
        super(name, address, priority);
    }

    @Override
    public String toString() {
        return "Candidate C: \n" +
                "Student ID: " + CandidateC.this.getId() + "\n" +
                "Name: " + CandidateC.this.getName() + "\n" +
                "Address: " + CandidateC.this.getAddress() + "\n" +
                "Priority: " + CandidateC.this.getPriority() + "\n" +
                "Exam Subject: " +  LITERARY + ", " + HISTORY + ", " + AGENT + "\n";
    }
}
