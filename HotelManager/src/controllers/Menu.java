package controllers;

import models.*;
import services.HotelManager;

import java.util.Scanner;

public class Menu {
    HotelManager hotelManager = new HotelManager();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    public void showMenu(){
        int choice;
        do {
            System.out.println("_____Hotel Manager______\n" +
                    "1. Add Customer\n" +
                    "2. Show All Customer\n" +
                    "3. Find Customer\n" +
                    "4. Payment\n" +
                    "0. Exit");
            System.out.println("Enter Your Choice");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    hotelManager.showAll();
                    break;
                case 3:
                    System.out.println("Enter Customer ID: ");
                    int findId = inputInt.nextInt();
                    System.out.println(hotelManager.findById(findId));
                    System.out.println("Find Success");
                    break;
                case 4:
                    System.out.println("Enter Customer ID:");
                    int id = inputInt.nextInt();
                    Customer customer = (Customer) hotelManager.findById(id);
                    System.out.println("Payable");
                    System.out.println(customer.grossRent());
                    hotelManager.deleteById(id);
                    System.out.println("Payment Success");
                    break;
                default:
                    System.out.println("Re-Enter");
            }
        } while (choice != 0);
    }
    private void addCustomer() {
        System.out.println("Enter Name");
        String name = inputString.next();
        System.out.println("Enter Age");
        int age = inputInt.nextInt();
        System.out.println("Enter Day Rent");
        int dayRent = inputInt.nextInt();
        inputString.nextLine();
        System.out.println("Choice Room Type");
        String typeRoom = inputString.nextLine();
        Room room = (Room) choiceRoomType(typeRoom);
        hotelManager.add(new Customer(name, age, room, dayRent));
        System.out.println("Add Success");
    }
    private Object choiceRoomType(String roomType) {
        Object room = null;
        switch (roomType) {
            case "a":
                room = new RoomA();
                break;
            case "b":
                room = new RoomB();
                break;
            case "c":
                room = new RoomC();
                break;
        }
        return room;
    }
}
