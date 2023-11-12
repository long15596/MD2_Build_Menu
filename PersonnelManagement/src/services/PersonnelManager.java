package services;

import models.Personnel;

import java.util.ArrayList;
import java.util.List;

public class PersonnelManager implements IManager{
    private final List<Personnel> personnelList = new ArrayList<>();

    @Override
    public void showAll() {
        for (Personnel p: personnelList) {
            System.out.println(p);
        }
    }

    @Override
    public void add(Personnel personnel) {
        personnelList.add(personnel);
    }

    @Override
    public Personnel findById(int id) {
        for (Personnel p: personnelList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Personnel findByName(String name) {
        for (Personnel p: personnelList) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void deleteByID(int id) {
        personnelList.removeIf(p -> p.getId() == id);
    }
    public void deleteByName(String name) {
            personnelList.removeIf(p -> p.getName().equals(name));
    }

//    public static void main(String[] args) {
//        Personnel personnel = new Personnel("a","n", 1, "g");
//        Personnel personnel1 = new Personnel("b","n", 1, "g");
//        Personnel personnel2 = new Personnel("c","n", 1, "g");
//        PersonnelManager personnelManager = new PersonnelManager();
//        personnelManager.add(personnel);
//        personnelManager.add(personnel1);
//        personnelManager.add(personnel2);
//        personnelManager.showAll();
//        int index = 2;
//        System.out.println(personnelManager.findById(index));
//        String name = "a";
//
//        personnelManager.deleteByName(name);
//        personnelManager.showAll();
//    }
}
