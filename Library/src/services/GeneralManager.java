package services;

import models.Document;

import java.awt.*;

public interface GeneralManager {
    void showAll();
    void add(Document document);
    Object findByID(int id);
    Object findByName(String name);
    void deleteById(int id);
    void deleteByName(String name);
}
