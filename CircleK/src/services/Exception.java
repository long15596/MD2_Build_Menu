package services;

import java.util.Scanner;

public class Exception {
    Scanner input = new Scanner(System.in);
    public int choiceException() {
        int choice = -1;
        do {
            try {
                choice = Integer.parseInt(input.nextLine());
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
