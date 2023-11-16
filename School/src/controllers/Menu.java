package controllers;

import models.Student;
import models.Teacher;
import services.StudentManager;
import services.TeacherManager;

import java.util.Scanner;

public class Menu {
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    Scanner inputDouble = new Scanner(System.in);
    public void showMenu() {
        int choice;
        do {
            System.out.println("____School Management____\n" +
                    "1. Student\n" +
                    "2. Teacher\n" +
                    "0. Exit\n" +
                    "Enter Your Choice: ");
            choice = choiceException();
            switch (choice){
                case 1:
                    studentMenu();
                    break;
                case 2:
                    teacherMenu();
                    break;
                default:
                    System.out.println("Re-import");
            }
        } while (choice != 0);
    }
    private void studentMenu(){
        StudentManager studentManager = new StudentManager();
        int choice;
        do {
            System.out.println("____Student Menu____\n" +
                    "1. Add Student\n" +
                    "2. Show Student\n" +
                    "3. Find Student By ID\n" +
                    "4. Remove Student\n" +
                    "5. Edit Information\n" +
                    "0. Exit\n" +
                    "Enter your choice: ");
            choice = choiceException();
            switch (choice) {
                case 1:
                    System.out.println("Enter name");
                    String name = inputString.nextLine();
                    System.out.println("Enter Match Point");
                    Double match = inputDouble.nextDouble();
                    System.out.println("Enter Physical Point");
                    Double physical = inputDouble.nextDouble();
                    System.out.println("Enter Chemistry Point");
                    Double chemistry = inputDouble.nextDouble();
                    studentManager.add(new Student(name, match, physical, chemistry));
                    System.out.println("Add New Student Success");
                    break;
                case 2:
                    int showChoice;
                    do{
                        System.out.println("_____Show Student_____\n" +
                                "1. Show All Student\n" +
                                "2. Show Excellent Student\n" +
                                "3. Show Average Student\n" +
                                "4. Show Fail Student\n" +
                                "0. Exit\n" +
                                "Enter your choice: ");
                        showChoice = choiceException();
                        switch (showChoice) {
                            case 1:
                                studentManager.showStudentInfo();
                                break;
                            case 2:
                                studentManager.showExcellentStudents();
                                break;
                            case 3:
                                studentManager.showAverageStudents();
                                break;
                            case 4:
                                studentManager.showFailStudents();
                                break;
                            default:
                                System.out.println("Re-import");
                        }
                    } while (showChoice != 0);
                    break;
                case 3:
                    System.out.println("Enter Student ID");
                    int findId = inputInt.nextInt();
                    studentManager.findById(findId);
                    System.out.println("Find Success");
                    break;
                case 4:
                    System.out.println("Enter Student ID");
                    int removeId = inputInt.nextInt();
                    studentManager.deleteById(removeId);
                    System.out.println("Remove Success");
                    break;
                case 5:
                    int editChoice;
                    do {
                        System.out.println("_____Edit Student_____\n" +
                                "1. Edit All Information\n" +
                                "2. Edit Individual Information\n" +
                                "Enter your choice: ");
                        editChoice = choiceException();
                        switch (editChoice) {
                            case 1:
                                System.out.println("Enter Student ID");
                                int editId = inputInt.nextInt();
                                System.out.println("New Name");
                                String newName = inputString.nextLine();
                                System.out.println("New Physical Points");
                                Double newPhysical = inputDouble.nextDouble();
                                System.out.println("New Chemistry Points");
                                Double newChemistry = inputDouble.nextDouble();
                                System.out.println("New Match Points");
                                Double newMatch = inputDouble.nextDouble();
                                Student editStudent = new Student(newName, newPhysical, newChemistry, newMatch);
                                studentManager.edit(editId, editStudent);
                                System.out.println(editStudent);
                                System.out.println("Edit Success");
                                break;
                            case 2:
                                int choice1;
                                System.out.println("Enter Student ID: ");
                                int editID = inputInt.nextInt();
                                Student editStudent1 = studentManager.findById(editID);
                                do {
                                    System.out.println("Choice Individual Information\n" +
                                            "1. Name\n" +
                                            "2. Physical\n" +
                                            "3. Chemistry\n" +
                                            "4. Match\n" +
                                            "0. Exit");
                                    System.out.print("Enter your choice: ");
                                    choice1 = choiceException();
                                    switch (choice1) {
                                        case 1:
                                            System.out.println("Enter New Name");
                                            String editName = inputString.nextLine();
                                            editStudent1.setName(editName);
                                            break;
                                        case 2:
                                            System.out.println("Enter New Physical");
                                            Double editPhysical = inputDouble.nextDouble();
                                            editStudent1.setPhysical(editPhysical);
                                            break;
                                        case 3:
                                            System.out.println("Enter New Chemistry");
                                            Double editChemistry = inputDouble.nextDouble();
                                            editStudent1.setPhysical(editChemistry);
                                            break;
                                        case 4:
                                            System.out.println("Enter New Chemistry");
                                            Double editMatch = inputDouble.nextDouble();
                                            editStudent1.setMatch(editMatch);
                                            break;
                                    }
                                } while (choice1 != 0);
                                System.out.println(editStudent1);
                                System.out.println("Edit Success");
                                break;
                            default:
                                System.out.println("Re-import");
                        }
                    } while (editChoice != 0);
                    break;
                default:
                    System.out.println("Re-import");
            }
        } while (choice != 0);
    }
    private void teacherMenu(){
        TeacherManager teacherManager = new TeacherManager();
        int choice;
        do {
            System.out.println("____Teacher Menu____\n" +
                    "1. Add New Teacher\n" +
                    "2. Show All Teachers\n" +
                    "3. Search Teacher\n" +
                    "4. Remove Teacher\n" +
                    "5. Sort By Salary\n" +
                    "6. Edit Information" +
                    "0. Exit\n" +
                    "Enter Your Choice:");
            choice = choiceException();
            switch (choice) {
                case 1:
                    System.out.println("___Add New Teacher____");
                    System.out.println("Enter name");
                    String name = inputString.nextLine();
                    System.out.println("Subject Teaching:");
                    String subject = inputString.nextLine();
                    System.out.println("Enter Salary");
                    Double salary = inputDouble.nextDouble();
                    teacherManager.add(new Teacher(name, subject, salary));
                    System.out.println("Add New Teacher Success");
                    break;
                case 2:
                    teacherManager.showAll();
                    break;
                case 3:
                    int searchChoice;
                    do {
                        System.out.println("____Search____\n" +
                                "1. By Id\n" +
                                "2. By Subject\n" +
                                "0. Exit" +
                                "Enter Your Choice");
                        searchChoice = choiceException();
                        switch (searchChoice) {
                            case 1:
                                System.out.println("Enter Teacher ID");
                                int searchId = inputInt.nextInt();
                                teacherManager.findById(searchId);
                                break;
                            case 2:
                                System.out.println("Enter Subject");
                                String searchSubject = inputString.nextLine();
                                teacherManager.findBySubject(searchSubject);
                                break;
                            default:
                                System.out.println("Re-import");
                        };
                    } while (searchChoice != 0);
                    break;
                case 4:
                    System.out.println("Enter Teacher ID");
                    int removeId = inputInt.nextInt();
                    teacherManager.deleteById(removeId);
                    System.out.println("Remove Success");
                    break;
                case 5:
                    teacherManager.sortBySalary();
                    break;
                case 6:
                    int editChoice;
                    do {
                        System.out.println("_____Edit Teacher_____\n" +
                                "1. Edit All Information\n" +
                                "2. Edit Individual Information\n" +
                                "0. Exit\n" +
                                "Enter Your Choice");
                        editChoice = choiceException();
                        switch (editChoice) {
                            case 1:
                                System.out.println("Enter Student ID");
                                int editId = inputInt.nextInt();
                                System.out.println("New Name");
                                String newName = inputString.nextLine();
                                System.out.println("New Subject");
                                String newSubject = inputString.nextLine();
                                System.out.println("New Salary");
                                Double newSalary = inputDouble.nextDouble();
                                Teacher editTeacher = new Teacher(newName, newSubject, newSalary);
                                teacherManager.edit(editId, editTeacher);
                                System.out.println(editTeacher);
                                System.out.println("Edit Success");
                                break;
                            case 2:
                                int choice1;
                                System.out.println("Enter Student ID: ");
                                int editID = inputInt.nextInt();
                                Teacher editTeacher1 = teacherManager.findById(editID);
                                do {
                                    System.out.println("Choice Individual Information\n" +
                                            "1. Name\n" +
                                            "2. Subject\n" +
                                            "3. Salary\n" +
                                            "0. Exit\n" +
                                            "Enter your choice: ");

                                    choice1 = choiceException();
                                    switch (choice1) {
                                        case 1:
                                            System.out.println("Enter New Name");
                                            String editName = inputString.nextLine();
                                            editTeacher1.setName(editName);
                                            break;
                                        case 2:
                                            System.out.println("Enter New Subject");
                                            String editSubject = inputString.nextLine();
                                            editTeacher1.setSubject(editSubject);
                                            break;
                                        case 3:
                                            System.out.println("Enter New Chemistry");
                                            Double editSalary = inputDouble.nextDouble();
                                            editTeacher1.setSalary(editSalary);
                                            break;
                                        default:
                                            System.out.println("Re-import");
                                    }
                                } while (choice1 != 0);
                                System.out.println(editTeacher1);
                                System.out.println("Edit Success");
                                break;
                            default:
                                System.out.println("Re-import");
                        }
                    }while (editChoice != 0);
                default:
                    System.out.println("Re-import");
            }
        } while (choice != 0);
    }
    private int choiceException() {
        int choice = -1;
        do {
            try {
                choice = Integer.parseInt(inputInt.nextLine());
                if (choice < 0) {
                    choice = -1;
                    System.out.println("Enter a number greater than zero");
                }
            } catch (NumberFormatException e) {
                System.out.println("Re-import Formatting");
            }
        } while (choice == -1);
        return choice;
    }
}
