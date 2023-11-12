package controllers;

import models.Employee;
import models.Engineer;
import models.Personnel;
import models.Worker;
import services.PersonnelManager;
import java.util.Scanner;

public class Menu {
    PersonnelManager personnelManager = new PersonnelManager();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    public void showMenu() {
        int choice;
        do {
            System.out.println("-----Menu-----\n" +
                    "1. Add Personnel\n" +
                    "2. Show All Personnel\n" +
                    "3. Find By Name\n" +
                    "4. Find By ID\n" +
                    "5. Remove Personnel By ID\n" +
                    "6. Remove Personnel By Name\n" +
                    "0. Exit");
            System.out.println("Choice: ");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showPersonnelMenu();
                    break;
                case 2:
                    personnelManager.showAll();
                    break;
                case 3:
                    System.out.println("Enter A Name:");
                    String name = inputString.nextLine();
                    System.out.println(personnelManager.findByName(name));
                    break;
                case 4:
                    System.out.println("Enter a ID:");
                    int id = inputInt.nextInt();
                    System.out.println(personnelManager.findById(id));
                    break;
                case 5:
                    System.out.println("Enter a ID:");
                    int idRemove = inputString.nextInt();
                    personnelManager.deleteByID(idRemove);
                    System.out.println("Remove Success\n" +
                            "Personnel List after remove");
                    personnelManager.showAll();
                    break;
                case 6:
                    System.out.println("Enter A Name:");
                    String nameRemove = inputString.nextLine();
                    personnelManager.deleteByName(nameRemove);
                    System.out.println("Remove Success\n" +
                            "Personnel List After Remove");
                    personnelManager.showAll();
            }
        } while (choice != 0);

    }
    public void showPersonnelMenu() {
        int choice;
        do {
            System.out.println("-----Personnel Menu-----\n" +
                    "1.Add Employee\n" +
                    "2.Add Engineer\n" +
                    "3.Add Worker\n" +
                    "0.Exit");
            System.out.println("Choice: ");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showEmployeeMenu();
                    break;
                case 2:
                    showEngineerMenu();
                    break;
                case 3:
                    showWorkerMenu();
                    break;
            }
        }while (choice != 0);
    }
    public void showEmployeeMenu() {
        System.out.println("Add Employee");
        System.out.println("Name: ");
        String name = inputString.nextLine();
        System.out.println("Age: ");
        int age = inputInt.nextInt();
        System.out.println("Gender: ");
        String gender = inputString.nextLine();
        System.out.println("Address: ");
        String address = inputString.nextLine();
        System.out.println("Work: ");
        String work = inputString.nextLine();
        Personnel personnel = new Employee(name, gender, age, address, work);
        personnelManager.add(personnel);
        System.out.println(personnel);
        System.out.println("Add Employee Success");
    }
    public void showEngineerMenu() {
        System.out.println("Add Engineer");
        System.out.println("Name: ");
        String name = inputString.nextLine();
        System.out.println("Age: ");
        int age = inputInt.nextInt();
        System.out.println("Gender: ");
        String gender = inputString.nextLine();
        System.out.println("Address: ");
        String address = inputString.nextLine();
        System.out.println("Training: ");
        String training = inputString.nextLine();
        Personnel personnel = new Engineer(name, gender, age, address, training);
        personnelManager.add(personnel);
        System.out.println(personnel);
        System.out.println("Add Engineer Success");
    }
    public void showWorkerMenu() {
        System.out.println("Add Worker");
        System.out.println("Name: ");
        String name = inputString.nextLine();
        System.out.println("Age: ");
        int age = inputInt.nextInt();
        System.out.println("Gender: ");
        String gender = inputString.nextLine();
        System.out.println("Address: ");
        String address = inputString.nextLine();
        System.out.println("Rank: ");
        int rank = inputInt.nextInt();
        Personnel personnel = new Worker(name, gender, age, address, rank);
        personnelManager.add(personnel);
        System.out.println(personnel);
        System.out.println("Add Worker Success");}
}
