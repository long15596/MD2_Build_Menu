package services;

import models.Motor;

import java.util.ArrayList;
import java.util.List;

public class MotorStore implements IManager{
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
        motorList.sort((m1, m2) -> Float.compare((float) m1.getCc(), (float) m2.getCc()));
        System.out.println(motorList);
    }
    public void sortUpCc() {
        motorList.sort((m1, m2) -> Float.compare((float) m2.getCc(), (float) m1.getCc()));
        System.out.println(motorList);
    }
}
