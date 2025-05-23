package com.pluralsight.models;

import com.pluralsight.utils.OrderItem;
import com.pluralsight.utils.Size;

import java.util.Scanner;

public class Drink implements OrderItem {
    // Variables
    private Size size;
    private double price;
    String itemName = "";

    // Constructors
    public Drink(String itemName, Size size, double price) {
        this.itemName = itemName;
        this.size = size;
        this.price = price;
    }

    public Drink() {}

    // Getters / Setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    // Methods
    public Drink addDrink() {
        Drink newDrink = new Drink();

        // ask the user what size drink they want to order
        System.out.println("*** ADD DRINK to ORDER ***");
        System.out.println("What size fountain drink would you like to order?");
        System.out.println("""
                [1] Small
                [2] Medium
                [3] Large
                """);
        System.out.println("Enter the menu number for the size you want to order:   ");
        Scanner scanner = new Scanner(System.in);
        String drinkOption = scanner.nextLine();

        switch(drinkOption) {
            case "1":
                newDrink.setSize(Size.SMALL);
                break;
            case "2":
                newDrink.setSize(Size.MEDIUM);
                break;
            case "3":
                newDrink.setSize(Size.LARGE);
                break;
        }

        newDrink.setItemName(String.format("%s Fountain Drink", newDrink.getSize()));
        newDrink.setPrice(newDrink.calculateTotal());
        displayDrinkConfirmation(newDrink);
        return newDrink;
    }

    // display confirmation message
    // TODO add to OrderItem interface => displayOrderItemInfo (?)
    public void displayDrinkConfirmation(Drink currentDrink) {
        System.out.println("\n");
        System.out.println("**************************");
        System.out.printf("You have added a %s to your order!\n", currentDrink.getItemName());
        System.out.printf("The cost is $%.2f\n", currentDrink.getPrice());
        System.out.println("**************************");
        System.out.println("\n");
    }

    @Override
    public double calculateTotal() {
        return switch (this.size) {
            case SMALL -> 2.00;
            case MEDIUM -> 2.50;
            case LARGE -> 3.00;
            default -> {
                System.out.println("Invalid size - please try again");
                yield 0;
            }
        };
    }
}
