package com.pluralsight.views;

import java.util.Scanner;

public class HomeScreen {
    public void displayHomeScreen() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        OrderScreen orderScreen = new OrderScreen();

        // Run the following options until the user quits
        while (isRunning) {
            System.out.println("HOME SCREEN MENU");
            System.out.println("[A] Start New Order");
            System.out.println("[B] Exit the Program App");
            String userOption = scanner.nextLine();

            switch(userOption.toLowerCase()) {
                case "a":
                    System.out.println("Run display order screen");
                    orderScreen.displayOrderScreen();
                    break;
                case "b":
                    System.out.println("Exiting the program...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option - please try again!");
            }
        }
    }

    // HELPER METHODS
    // Create ASCII graphic for the home screen
    private void displayASCII() {
        System.out.println("Method - ASCII Graphic for Deli-Licious Sandwich Shop");
    }

    // Welcome message
    private void displayWelcome() {
        System.out.println("Method - Welcome message");
    }
}
