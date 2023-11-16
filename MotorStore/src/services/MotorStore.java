package services;

import models.Motor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MotorStore implements IManager<Object, String, Integer>{
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
    public void delete(Integer id) {
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
    public void edit(Motor newMotor, String newName, double newPrice, int newCc) {
           newMotor.setName(newName);
           newMotor.setPrice(newPrice);
           newMotor.setCc(newCc);
           for (int i = 0; i < motorList.size(); i++) {
               if(newMotor == motorList.get(i))
                   motorList.set(i, newMotor);
       }
    }

    public Object findByPriceRange(double maxPrice, double minPrice) {
        for (Motor motor : motorList) {
            if (motor.getPrice() < maxPrice && motor.getPrice() > minPrice) return motor;
        }
        return "Not Found";
    }
    public Object findByPrice(double price) {
        for (Motor motor : motorList) {
            if (motor.getPrice() == price) return motor;
        }
        return "Not Found";
    }
    public void sortDownCc() {
        List<Motor> sortList = new LinkedList<>(motorList);
        sortList.sort(Comparator.comparingInt(Motor::getCc));
        System.out.println(sortList);
    }
    public void sortUpCc() {
        List<Motor> sortList = new LinkedList<>(motorList);
        sortList.sort((m1, m2) -> Integer.compare(m2.getCc(), m1.getCc()));
        System.out.println(sortList);
    }

}
