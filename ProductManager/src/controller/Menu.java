package controller;

import models.Customer;
import models.Exception;
import services.CustomerManager;
import services.ProductManager;

import java.util.Scanner;

public class Menu {
    ProductManager productManager = new ProductManager();
    CustomerManager customerManager = new CustomerManager();
    Exception exception = new Exception();
    Scanner inputNum = new Scanner(System.in);
    Scanner inputStr = new Scanner(System.in);
    public void showMenu() {
        int choice;
        do {
            System.out.println("_____Product Manager____\n" +
                    "1. Show All Product\n" +
                    "2. Add Product To Cart\n" +
                    "3. FInd By Id\n" +
                    "4. Find By Name\n" +
                    "5. Remove\n" +
                    "0. Exit\n" +
                    "Enter your choice");
            choice = exception.choiceException();
            switch (choice) {
                case 1:
                    productManager.showAll();
                    break;
                case 2:
                    System.out.println("Enter Customer Name: ");
                    String name = inputStr.nextLine();
                    Customer customer = new Customer(name);
                    customerManager.addProductToCart(productManager, customer);
                    break;
                case 3:
                    System.out.println("Enter Product ID: ");
                    int findId = exception.choiceException();
                    System.out.println(productManager.findById(findId));
                    System.out.println("Find Success");
                    break;
                case 4:
                    System.out.println("Enter Product Name");
                    String findName = inputStr.nextLine();
                    System.out.println(productManager.findByName(findName));
                    System.out.println("Find Success");
                    break;
                case 5:
                    System.out.println("Enter Product ID: ");
                    int removeId = exception.choiceException();
                    productManager.removeById(removeId);
                    System.out.println("Remove Success");
            }
        } while (choice != 0);
    }
}

