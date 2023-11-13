package controllers;

import models.Person;
import services.Family;
import services.Street;

import java.util.Scanner;

public class Menu {
    Street street = new Street();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    public void showMenu(){
        int choice;
        do {
            System.out.println("_____Street Menu_____\n" +
                    "1. Add New Family\n" +
                    "2. Add Person To Family\n" +
                    "3. Show All Family\n" +
                    "4. Search Family\n" +
                    "0. Exit");
            System.out.print("Choice: ");
            choice = inputInt.nextInt();
            switch (choice){
                case 1:
                    Family family = new Family();
                    street.add(family);
                    System.out.println("Add Family Success\n" +
                            "Family Number: " + family.getHouseNumber());
                    addPersonMenu(family);
                    break;
                case 2:
                    addFamilyMenu();
                    break;
                case 3:
                    street.showAll();
                    break;
                case 4:
                    searchFamilyMenu();
                    break;
            }
        } while (choice != 0);
    }
    private void addFamilyMenu() {
        int choice;
        do {
            System.out.println("_____Add Family Menu_____\n" +
                    "1. Add Person\n" +
                    "2. Show All Family\n" +
                    "3. Search Person By ID\n" +
                    "4. Delete Person By ID\n" +
                    "0. Exit");
            choice = inputString.nextInt();
            switch (choice){
                case 1:
                    choiceHouse();
                    break;
                case 2:
                    street.showAll();
                    break;
                case 3:
                    System.out.println("Enter Number House");
                    int findNum = inputInt.nextInt();
                    System.out.println(street.findById(findNum));
                    System.out.println("Find Success");
                    break;
                case 4:
                    System.out.println("Enter Number House");
                    int removeNum = inputInt.nextInt();
                    street.deleteById(removeNum);
                    System.out.println("Remove Success");
                    break;
            }
        } while (choice != 0);

    }
    private void choiceHouse() {
        System.out.println("Enter Number House: ");
        int num = inputInt.nextInt();
        Family family = (Family) street.findById(num);
        addPersonMenu(family);
    }
    private void addPersonMenu(Family family){
        int choice;
        do {
            System.out.println("____Add Person House Number " + family.getHouseNumber() + "____\n" +
                    "1. Add Person\n" +
                    "2. Show All Person\n" +
                    "3. Find By ID\n" +
                    "4. Delete By ID\n" +
                    "0. Exit");
            System.out.print("Enter Your Choice: ");
            choice = inputInt.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Name: ");
                    String name = inputString.nextLine();
                    System.out.println("Age: ");
                    int age = inputInt.nextInt();
                    System.out.println("Profession: ");
                    String profession = inputString.nextLine();
                    family.add(new Person(name, age, profession));
                    System.out.println("Add Success");
                    break;
                case 2:
                    System.out.println("All Person In Family: \n");
                    family.showAll();
                    break;
                case 3:
                    System.out.print("Enter Person ID In Family: ");
                    int findId = inputInt.nextInt();
                    family.findById(findId);
                    System.out.println("Find Success");
                    break;
                case 4:
                    System.out.print("Enter Person ID In Family: ");
                    int removeId = inputInt.nextInt();
                    family.deleteById(removeId);
                    System.out.println("Remove Success");
                    break;
            }
        }while (choice != 0);
    }
    private void searchFamilyMenu(){
        int choice;
        do {
            System.out.println("_____Search Menu_____\n" +
                    "1. Find By House Number\n" +
                    "2. Find By Number Person\n" +
                    "0. Exit");
            System.out.print("Enter your choice: ");
            choice = inputInt.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter House Number");
                    int houseNumber = inputInt.nextInt();
                    street.findById(houseNumber);
                    break;
                case 2:
                    System.out.print("Enter Number Person");
                    int numberPeron = inputInt.nextInt();
                    street.findByPersonNumber(numberPeron);
                    break;
            }
        }while (choice != 0);
    }
}
