package services;

import models.Motor;

import java.util.ArrayList;
import java.util.List;

public class MotorStore implements IManager<Object, String>{
    List<Motor> motorList = new ArrayList<>();
    @Override
    public void showAll() {
        for (Motor motor : motorList) {
            System.out.println(motor);
        }
    }

    @Override
    public void add(Object obj) {
        motorList.add((Motor) obj);
    }

    @Override
    public void delete(int id) {
        motorList.removeIf(motor -> motor.getId() == id);
    }

    @Override
    public Object findByName(String name) {
        for (Motor motor : motorList) {
            if (motor.getName().contains(name)) {
                return motor;
            }
        }
        return "Not Found";
    }


    public Object findByPrice(float price) {
        for (Motor motor : motorList) {
            if (motor.getPrice() == price) return motor;
        }
        return "Not Found";
    }
    public void sortDownCc() {
        List<Motor> sortList = motorList;
        sortList.sort((m1, m2) -> Integer.compare(m1.getCc(), m2.getCc()));
        System.out.println(sortList);
    }
    public void sortUpCc() {
        List<Motor> sortList = motorList;
        sortList.sort((m1, m2) -> Integer.compare(m2.getCc(), m1.getCc()));
        System.out.println(sortList);
    }
}
