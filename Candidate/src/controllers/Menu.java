package controllers;

import models.CandidateA;
import models.CandidateB;
import models.CandidateC;
import services.CandidateManager;

import java.util.Scanner;

public class Menu {
    CandidateManager candidateManager = new CandidateManager();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void showMenu() {
        int choice;
        do {
            System.out.println("_____Manage Contestants_____\n" +
                    "1. Add Student\n" +
                    "2. Show All Student\n" +
                    "3. Search Student By ID\n" +
                    "4. Search Student By Name\n" +
                    "5. Remove Student Form List By ID\n" +
                    "6. Remove Student Form List By Name\n" +
                    "0. Exit");
            System.out.print("Enter your choice: ");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    addMenu();
                    break;
                case 2:
                    candidateManager.showAll();
                    break;
                case 3:
                    System.out.println("Enter ID");
                    int findId = inputInt.nextInt();
                    System.out.println(candidateManager.findById(findId));
                    System.out.println("Find Success");;
                    break;
                case 4:
                    System.out.println("Enter Name");
                    String findName = inputString.nextLine();
                    System.out.println(candidateManager.findByName(findName));
                    System.out.println("Find Success");;
                    break;
                case 5:
                    System.out.println("Enter ID");
                    int removeID = inputInt.nextInt();
                    candidateManager.deleteById(removeID);
                    System.out.println("Remove Success");
                    break;
                case 6:
                    System.out.println("Enter Name");
                    String removeName = inputString.nextLine();
                    candidateManager.deleteByName(removeName);
                    System.out.println("Remove Success");
                    break;
            }
        } while (choice != 0);
    }

    private void addMenu() {
        int choice;
        do {
            System.out.println("_____Choice Candidate_____\n" +
                    "1. Candidate A\n" +
                    "2. Candidate B\n" +
                    "3. Candidate C\n" +
                    "0. Exit");
            System.out.print("Enter Your Choice: ");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("_____Add Student_____");
                    System.out.println("Name");
                    String nameA = inputString.nextLine();
                    System.out.println("Address");
                    String addressA = inputString.nextLine();
                    System.out.println("Priority");
                    int priorityA = inputInt.nextInt();
                    candidateManager.add(new CandidateA(nameA, addressA, priorityA));
                    System.out.println("Add Success");
                    break;
                case 2:
                    System.out.println("_____Add Student_____");
                    System.out.println("Name");
                    String nameB = inputString.nextLine();
                    System.out.println("Address");
                    String addressB = inputString.nextLine();
                    System.out.println("Priority");
                    int priorityB = inputInt.nextInt();
                    candidateManager.add(new CandidateB(nameB, addressB, priorityB));
                    System.out.println("Add Success");
                    break;
                case 3:
                    System.out.println("_____Add Student_____");
                    System.out.println("Name");
                    String nameC = inputString.nextLine();
                    System.out.println("Address");
                    String addressC = inputString.nextLine();
                    System.out.println("Priority");
                    int priorityC = inputInt.nextInt();
                    candidateManager.add(new CandidateC(nameC, addressC, priorityC));
                    System.out.println("Add Success");
                    break;
            }
        } while (choice != 0);
    }

//    public Candidate addStudent() {
//        System.out.println("_____Add Student_____");
//        System.out.println("Name");
//        String name = inputString.nextLine();
//        System.out.println("Address");
//        String address = inputString.nextLine();
//        System.out.println("Priority");
//        int priority = inputInt.nextInt();
//        return new Candidate(name, address, priority);
//    }
//    public static void main(String[] args) {
//        Menu menu = new Menu();
//        CandidateA student = (CandidateA) menu.addStudent();
//        System.out.println(student);
//    }
}