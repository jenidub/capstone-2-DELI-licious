package com.pluralsight.models;

import com.pluralsight.utils.OrderItem;
import com.pluralsight.utils.Size;

public class Chips implements OrderItem {
    // Variables
    private final double price;
    String itemName;

    // Constructors
    public Chips() {
        this.itemName = "Bag of Chips";
        this.price = 1.5;
    }

    // getters / setters
    public double getPrice() {
        return price;
    }

    public String getItemName() {
        return itemName;
    }

    // methods
    public Chips addChips() {
        Chips newChips = new Chips();
        displayChipConfirmationMessage(newChips);
        return newChips;
    }

    public void displayChipConfirmationMessage(Chips currentChips) {
        System.out.println("\n");
        System.out.println("**************************");
        System.out.printf("You have added a %s to your order!\n", currentChips.getItemName());
        System.out.printf("The cost is $%.2f\n", currentChips.getPrice());
        System.out.println("**************************");
        System.out.println("\n");
    }

    @Override
    public double calculateTotal() {
        return 1.5;
    }
}
