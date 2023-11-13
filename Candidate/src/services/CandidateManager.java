package services;

import models.Candidate;

import java.util.ArrayList;
import java.util.List;

public class CandidateManager implements GeneralManager{
    List<Candidate> candidateList = new ArrayList<>();
    @Override
    public void add(Candidate object) {
        candidateList.add(object);
    }

    @Override
    public void showAll() {
        for (Candidate c: candidateList) {
            System.out.println(c);
        }
    }

    @Override
    public Object findById(int id) {
        for (Candidate c : candidateList) {
            if (c.getId() == id) return c;
        }
        return "Not Found\n";
    }

    @Override
    public Object findByName(String name) {
        for (Candidate c: candidateList) {
            if (c.getName().equals(name)) return c;
        }
        return "Not Found\n";
    }

    @Override
    public void deleteById(int id) {
        candidateList.removeIf(c -> c.getId() == id);
    }

    @Override
    public void deleteByName(String name) {
        candidateList.removeIf(c -> c.getName().equals(name));
    }

//    public static void main(String[] args) {
//        CandidateManager candidateManager = new CandidateManager();
//        Candidate c1 = new CandidateA("a","b", 1);
//        Candidate c2 = new CandidateA("b","b", 1);
//        Candidate c3 = new CandidateB("c","b", 1);
//        Candidate c4 = new CandidateB("d","b", 1);
//        Candidate c5 = new CandidateC("e","b", 1);
//        Candidate c6 = new CandidateC("f","b", 1);
//        candidateManager.add(c1);
//        candidateManager.add(c2);
//        candidateManager.add(c3);
//        candidateManager.add(c4);
//        candidateManager.add(c5);
//        candidateManager.add(c6);
//        System.out.println(candidateManager.findById(3));
//        System.out.println(candidateManager.findById(9));
//        System.out.println(candidateManager.findByName("f"));
//        System.out.println(candidateManager.findByName("p"));
//        candidateManager.deleteById(3);
//        candidateManager.deleteByName("f");
//        candidateManager.showAll();
//    }
}
