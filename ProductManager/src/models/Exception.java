package models;

import java.util.Scanner;

public class Exception {
    Scanner inputNum = new Scanner(System.in);
    public int choiceException() {
        int choice = -1;
        do {
            try {
                choice = Integer.parseInt(inputNum.nextLine());
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

    public static void main(String[] args) {
        Exception exception = new Exception();
        int e  = exception.choiceException();
    }
}
