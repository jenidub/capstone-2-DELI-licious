package com.pluralsight.models;

import com.pluralsight.utils.OrderItem;
import com.pluralsight.utils.SandwichMenuList;
import com.pluralsight.utils.Size;

public class Sandwich implements OrderItem {
    // Variables for Constructor
    private String breadChoice;
    private String[] meatChoices, cheeseChoices, toppingChoices, sauceChoices, sideChoices;

    // Other Variables
    Size sizeOptions;
    SandwichMenuList sandwichItemMenu;

    // Constructor
    public Sandwich(
            String breadChoice,
            String[] meatChoices,
            String[] cheeseChoices,
            String[] toppingChoices,
            String[] sauceChoices,
            String[] sideChoices) {
        this.breadChoice = breadChoice;
        this.meatChoices = meatChoices;
        this.cheeseChoices = cheeseChoices;
        this.toppingChoices = toppingChoices;
        this.sauceChoices = sauceChoices;
        this.sideChoices = sideChoices;
    }

    public Sandwich() {}

    // Getters / Setters
    public String getBreadChoice() {
        return breadChoice;
    }

    public void setBreadChoice(String breadChoice) {
        this.breadChoice = breadChoice;
    }

    public String[] getMeatChoices() {
        return meatChoices;
    }

    public void setMeatChoices(String[] meatChoices) {
        this.meatChoices = meatChoices;
    }

    public String[] getCheeseChoices() {
        return cheeseChoices;
    }

    public void setCheeseChoices(String[] cheeseChoices) {
        this.cheeseChoices = cheeseChoices;
    }

    public String[] getToppingChoices() {
        return toppingChoices;
    }

    public void setToppingChoices(String[] toppingChoices) {
        this.toppingChoices = toppingChoices;
    }

    public String[] getSauceChoices() {
        return sauceChoices;
    }

    public void setSauceChoices(String[] sauceChoices) {
        this.sauceChoices = sauceChoices;
    }

    public String[] getSideChoices() {
        return sideChoices;
    }

    public void setSideChoices(String[] sideChoices) {
        this.sideChoices = sideChoices;
    }

    // methods list
    // TODO : This is where you left off...
    public Sandwich addSandwich() {
        Sandwich newSandwich = new Sandwich();
        System.out.println("creating a sandwich...");
        return newSandwich;
    }

    @Override
    public double calculateTotal() {
        System.out.println("calculate the sandwich total...");
        return 0;
    };
}
