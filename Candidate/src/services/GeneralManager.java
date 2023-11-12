package services;

import models.Candidate;

public interface GeneralManager {
    void add(Candidate object);
    void showAll();
    Object findById(int id);
    Object findByName(String name);
    void deleteById(int id);
    void deleteByName(String name);
}
