package controllers;

import models.Motor;
import services.MotorStore;

import java.util.Scanner;

public class Menu {
    MotorStore motorStore = new MotorStore();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputDouble = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    public void showMenu() {
        int choice;
        do {
            System.out.println("_____Motor Store_____\n" +
                    "1. Add New Motor\n" +
                    "2. Show All Products\n" +
                    "3. Search\n" +
                    "4. Remove Products By Id\n" +
                    "5. Sort Products\n" +
                    "6. Edit Information\n" +
                    "0. Exit");
            System.out.print("Enter your choice: ");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    addMenu();
                    break;
                case 2:
                    motorStore.showAll();
                    break;
                case 3:
                    searchMenu();
                    break;
                case 4:
                    System.out.print("Enter Id: ");
                    int removeId = inputInt.nextInt();
                    motorStore.delete(removeId);
                    System.out.println("Remove Success");
                    break;
                case 5:
                    sortMenu();
                    break;
                case 6:
                    editMenu();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice != 0);
    }
    private void addMenu(){
        System.out.println("____Product Information____");
        System.out.print("Enter Name: ");
        String name = inputString.nextLine();
        System.out.print("Enter Price: ");
        double price = inputDouble.nextDouble();
        System.out.print("Enter Cylinder Capacity: ");
        int cc = inputInt.nextInt();
        Motor newMotor = new Motor(name, price, cc);
        motorStore.add(newMotor);
        System.out.println(newMotor);
        System.out.println("Add Success");
    }
    private void searchMenu(){
        int choice;
        do {
            System.out.println("_____Search_____\n" +
                    "1. Search By Price\n" +
                    "2. Search By Price Range\n" +
                    "3. Search By Name\n" +
                    "0. Exit");
            System.out.print("Enter your choice: ");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Id: ");
                    double price = inputDouble.nextDouble();
                    System.out.println(motorStore.findByPrice(price));
                    System.out.println("Find Success");
                    break;
                case 2:
                    System.out.print("Enter Min Price: ");
                    double minPrice = inputDouble.nextDouble();
                    System.out.print("Enter Max Price: ");
                    double maxPrice = inputDouble.nextDouble();
                    System.out.println(motorStore.findByPriceRange(maxPrice, minPrice));
                    System.out.println("Find Success");
                    break;
                case 3:
                    System.out.println("Enter Name: ");
                    String name = inputString.nextLine();
                    System.out.println(motorStore.findByName(name));
                    System.out.println("Find Success");
                    break;
                default:
                    System.out.println("Invalid");
            }
        } while (choice != 0);
    }
    private void sortMenu(){
        int choice;
        do {
            System.out.println("_____Sort_____\n" +
                    "1. Sort By Increased CC\n" +
                    "2. Sort By Decreasing CC\n" +
                    "0. Exit");
            System.out.print("1 Go Up & 2 Go Down: ");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("List Motor");
                    motorStore.sortUpCc();
                    break;
                case 2:
                    System.out.println("List Motor: ");
                    motorStore.sortDownCc();
                    break;
                default:
                    System.out.println("Invalid");
            }
        } while (choice != 0);
    }
    private void editMenu() {
        int choice;
        do {
            System.out.println("____Edit Menu____\n" +
                    "1. Edit All Information\n" +
                    "2. Edit Individual Information\n" +
                    "0. Exit");
            System.out.println("Enter Your choice");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Name Product: ");
                    String findName = inputString.nextLine();
                    Motor newMotor = (Motor) motorStore.findByName(findName);
                    System.out.println("Product To Edit: \n" + newMotor);
                    System.out.println("Enter New Name: ");
                    String newName = inputString.nextLine();
                    System.out.println("Enter New Price: ");
                    double newPrice = inputDouble.nextFloat();
                    System.out.println("Enter New Cc: ");
                    int newCc = inputInt.nextInt();
                    motorStore.edit(newMotor, newName, newPrice, newCc);
                    System.out.println("Edit Success");
                    break;
                case 2:
                    System.out.println("Enter Name Product: ");
                    String findName2 = inputString.nextLine();
                    Motor newMotor2 = (Motor) motorStore.findByName(findName2);
                    do {
                        System.out.println("Choice Individual Information\n" +
                                "1. Name\n" +
                                "2. Price\n" +
                                "3. Cc\n" +
                                "0. Exit");
                        System.out.print("Enter your choice: ");
                        choice = inputInt.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Enter New Name");
                                String newName2 = inputString.nextLine();
                                newMotor2.setName(newName2);
                                break;
                            case 2:
                                System.out.println("Enter New Price");
                                double newPrice2 = inputDouble.nextFloat();
                                newMotor2.setPrice(newPrice2);
                                break;
                            case 3:
                                System.out.println("Enter New Cc");
                                int newCc2 = inputInt.nextInt();
                                newMotor2.setCc(newCc2);
                                break;
                        }
                    } while (choice != 0);
                    System.out.println(newMotor2);
                    System.out.println("Edit Success");
                    break;
            }
        } while (choice != 0);
    }
}
