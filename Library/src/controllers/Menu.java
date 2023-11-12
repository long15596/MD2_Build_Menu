package controllers;

import models.Book;
import models.Magazine;
import models.Newspaper;
import services.LibraryManager;

import java.util.Scanner;

public class Menu {
    LibraryManager libraryManager = new LibraryManager();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    public void showMenu(){
        int choice;
        do {
            System.out.println("-----Library-----\n" +
                    "1. Add Document\n" +
                    "2. Show All Document\n" +
                    "3. Delete By Document Core\n" +
                    "4. Search\n" +
                    "0. Exit");
            System.out.println("Enter your choice");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    addDocMenu();
                    break;
                case 2:
                    libraryManager.showAll();
                    break;
                case 3:
                    System.out.println("Enter Document Core");
                    int removeId = inputInt.nextInt();
                    libraryManager.deleteById(removeId);
                    System.out.println("Remove Success");
                    break;
                case 4:
                    searchMenu();
                    break;
            }
        } while (choice != 0);
    }
    public void addDocMenu(){
        int choice;
        do {
            System.out.println("-----Add Document Menu-----\n" +
                    "1. Add Book\n" +
                    "2. Add Newspaper\n" +
                    "3. Add Magazine\n" +
                    "0. Exit");
            System.out.println("Enter your choice");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    addBookMenu();
                    break;
                case 2:
                    addNewspaperMenu();
                    break;
                case 3:
                    addMagazineMenu();
                    break;
            }
        } while (choice != 0);
    }
    public void searchMenu(){
        int choice;
        do {
            System.out.println("-----Search Menu-----\n" +
                    "1. Search Document\n" +
                    "2. Search Book\n" +
                    "3. Search Newspaper\n" +
                    "4. Search Magazine\n" +
                    "0. Exit");
            System.out.println("Enter your choice");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Document Core");
                    int core = inputInt.nextInt();
                    System.out.println(libraryManager.findByID(core));
                    break;
                case 2:
                    System.out.println("Enter Book Name");
                    String name = inputString.nextLine();
                    System.out.println(libraryManager.findBook(name));
                    break;
                case 3:
                    System.out.println("Enter Newspaper Core");
                    int nCore = inputInt.nextInt();
                    System.out.println(libraryManager.findNewspaper(nCore));
                case 4:
                    System.out.println("Enter Magazine Issue Number");
                    int issueNum = inputInt.nextInt();
                    System.out.println(libraryManager.findMagazine(issueNum));
            }
        } while (choice != 0);
    }
    public void addBookMenu(){
        System.out.println("Manufacture Name");
        String manuName = inputString.nextLine();
        System.out.println("Release Number");
        int releaseNum = inputInt.nextInt();
        System.out.println("Book Name");
        String bookName = inputString.nextLine();
        System.out.println("Author's Name");
        String authorsName = inputString.nextLine();
        System.out.println("Numbers Of Pages");
        int numOfPages = inputInt.nextInt();
        libraryManager.add(new Book(manuName, releaseNum, bookName, authorsName, numOfPages));
        System.out.println("Add Success");
    }
    public void addNewspaperMenu(){
        System.out.println("Manufacture Name");
        String manuName = inputString.nextLine();
        System.out.println("Release Number");
        int releaseNum = inputInt.nextInt();
        System.out.println("Release Date");
        String date = inputString.nextLine();
        libraryManager.add(new Newspaper(manuName, releaseNum, date));
        System.out.println("Add Success");
    }
    public void addMagazineMenu(){
        System.out.println("Manufacture Name");
        String manuName = inputString.nextLine();
        System.out.println("Release Number");
        int releaseNum = inputInt.nextInt();
        System.out.println("Issue Numbers");
        int issueNum = inputInt.nextInt();
        System.out.println("Release Month");
        String month = inputString.nextLine();
        libraryManager.add(new Magazine(manuName, releaseNum, issueNum, month));
        System.out.println("Add Success");
    }
}
