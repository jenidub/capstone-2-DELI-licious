package com.pluralsight;

import java.util.Scanner;

public class OrderScreen {
    Scanner scanner = new Scanner(System.in);

    public void displayOrderScreen() {
        boolean activeOrder = true;

        // welcome message
        // instructions message with options
        displayOrderScreenWelcome();
        displayOrderScreenInstructions();

        // run menu for adding options to the order until checkout/cancel
        while (activeOrder) {
            // menu of options for adding items
            System.out.println("Here are the order menu options:");
            // 1) Add Sandwich
            System.out.println("[1] Add Sandwich");
            //o 2) Add Drink
            System.out.println("[2] Add Drink");
            //o 3) Add Chips
            System.out.println("[3] Add Chips");
            //o 4) Checkout
            System.out.println("[4] Checkout");
            //o 0) Cancel Order
            System.out.println("[0] Cancel Order");

            // prompt user to make a selection
            System.out.println("Please make your selection now:");
            int userSelection = Integer.parseInt(scanner.nextLine());

            // process the user selection with the matching method
            switch(userSelection) {
                case 1:
                    System.out.println("Sandwich addSandwich() method");
                    break;
                case 2:
                    System.out.println("Drink addDrink() method");
                    break;
                case 3:
                    System.out.println("Chips addChips() method");
                    break;
                case 4:
                    System.out.println("Checkout displayCheckoutScreen() method");
                    break;
                case 0:
                    System.out.println("Cancel order - clear data, return to home screen");
                    activeOrder = false;
                    break;
                default:
                    System.out.println("Invalid selection - please try again");
            }
        }
    }

    private void displayOrderScreenWelcome() {
        // welcome message
        System.out.println("This is the order screen welcome");
    }

    private void displayOrderScreenInstructions() {
        // instructions message with options
        System.out.println("This is the order screen instructions");
    }
}
