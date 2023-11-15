package controllers;

import models.Motor;
import services.MotorStore;

import java.util.Scanner;

public class Menu {
    MotorStore motorStore = new MotorStore();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputFloat = new Scanner(System.in);
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
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice != 0);
    }
    private void addMenu(){
        System.out.print("Enter Name: ");
        String name = inputString.nextLine();
        System.out.print("Enter Price: ");
        float price = inputFloat.nextFloat();
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
                    "2. Search By Name\n" +
                    "0. Exit");
            System.out.print("Enter your choice: ");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Id: ");
                    int price = inputInt.nextInt();
                    System.out.println(motorStore.findByPrice(price));
                    System.out.println("Find Success");
                    break;
                case 2:
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
}
