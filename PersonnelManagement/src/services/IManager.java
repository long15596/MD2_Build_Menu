package services;

import models.Personnel;

public interface IManager {
    void showAll();
    void add(Personnel personnel);
    Personnel findById(int id);
    Personnel findByName(String name);
    void deleteByID(int id);
}
