package com.pluralsight.models.orderitems;

import com.pluralsight.models.sandwichItems.*;
import com.pluralsight.utils.OrderItem;
import com.pluralsight.utils.SandwichMenuList;
import com.pluralsight.utils.Size;

import java.util.ArrayList;
import java.util.Scanner;

public class Sandwich implements OrderItem {
    // Variables for Constructor
    private Size sandwichSize;
    private String breadChoice;
    private ArrayList<String> meatChoices, cheeseChoices, toppingChoices, sauceChoices, sideChoices;
    private double sandwichTotal = 0;
    private String itemName = "";

    // Other Variables
    Size sizeOptions;
    SandwichMenuList sandwichItemMenu = new SandwichMenuList();
//    Meat meat = new Meat();
    Cheese cheese = new Cheese();
//    Toppings toppings = new Toppings();
//    Sauces sauces = new Sauces();
//    Sides sides = new Sides();

    Scanner scanner = new Scanner(System.in);

    // Constructor
    public Sandwich(
            Size sandwichSize,
            String breadChoice,
            ArrayList<String> meatChoices,
            ArrayList<String> cheeseChoices,
            ArrayList<String> toppingChoices,
            ArrayList<String> sauceChoices,
            ArrayList<String> sideChoices,
            double sandwichTotal,
            String itemName) {
        this.sandwichSize = sandwichSize;
        this.breadChoice = breadChoice;
        this.meatChoices = meatChoices;
        this.cheeseChoices = cheeseChoices;
        this.toppingChoices = toppingChoices;
        this.sauceChoices = sauceChoices;
        this.sideChoices = sideChoices;
        this.sandwichTotal = sandwichTotal;
        this.itemName = itemName;
    }

    public Sandwich() {}

    // Getters / Setters
    public String getBreadChoice() {
        return breadChoice;
    }

    public void setBreadChoice(String userChoice) {
        String[] breadMenu = sandwichItemMenu.breadChoices;
        for (String bread : breadMenu) {
            if (bread.equalsIgnoreCase(userChoice)) {
                this.breadChoice = bread;
                break;
            }
        }
    }

    public ArrayList<String>getMeatChoices() {
        return meatChoices;
    }

    public void setMeatChoices(ArrayList<String> meatChoices) {
        this.meatChoices = meatChoices;
    }

    public ArrayList<String> getCheeseChoices() {
        return cheeseChoices;
    }

    public void setCheeseChoices(ArrayList<String> cheeseChoices) {
        this.cheeseChoices = cheeseChoices;
    }

    public ArrayList<String> getToppingChoices() {
        return toppingChoices;
    }

    public void setToppingChoices(ArrayList<String> toppingChoices) {
        this.toppingChoices = toppingChoices;
    }

    public ArrayList<String> getSauceChoices() {
        return sauceChoices;
    }

    public void setSauceChoices(ArrayList<String> sauceChoices) {
        this.sauceChoices = sauceChoices;
    }

    public ArrayList<String> getSideChoices() {
        return sideChoices;
    }

    public void setSideChoices(ArrayList<String>sideChoices) {
        this.sideChoices = sideChoices;
    }

    public Size getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(Size sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public double getSandwichTotal() {
        return sandwichTotal;
    }

    public void setSandwichTotal(double sandwichTotal) {
        this.sandwichTotal = sandwichTotal;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    // methods list
    public Sandwich addSandwich() {
        Sandwich newSandwich = new Sandwich();

        System.out.println("Who is this sandwich for?");
        setItemName(scanner.nextLine());

        System.out.println("What size sandwich would you like?");
        System.out.println("Enter the corresponding number to make your selection");
        System.out.println("""
                [1] Small 4"
                [2] Medium 8"
                [3] Large 12"
                """);

        // Ask user for bread size
        String userSizeChoice = scanner.nextLine();
        newSandwich.setSandwichSize(matchSize(userSizeChoice));
        System.out.println("sandwich size:    " + newSandwich.getSandwichSize());

        // Ask user for bread selection - one choice / no extra
        sandwichItemMenu.displayChoices(sandwichItemMenu.breadChoices, "BREAD");
        System.out.println("What type of bread would you like?");
        int userChoice = Integer.parseInt(scanner.nextLine());
        newSandwich.setBreadChoice(sandwichItemMenu.breadChoices[userChoice - 1]);
        System.out.println("sandwich bread choice:    " + newSandwich.getBreadChoice());

        // Ask user for meat selections - multiple w/ extra options
        Meat meat = new Meat();
        ArrayList<String> meatSelections = meat.getUserChoices(scanner, this.sandwichSize);
        newSandwich.setMeatChoices(meatSelections);
        System.out.println("Meat(s) you selected:    " + newSandwich.getMeatChoices().toString());

        double updatedTotal = newSandwich.getSandwichTotal() + meat.calculateTotalPrice(this.sandwichSize);
        newSandwich.setSandwichTotal(updatedTotal);
        System.out.println("sandwich total after meats:    $" + newSandwich.getSandwichTotal());

        // Ask user for cheese selections - multiple w/ extra options
        System.out.println("next is cheese!...");
//        Cheese cheeseSelections = new Cheese();
//        newSandwich.setCheeseChoices(cheeseSelections.getUserChoices(scanner, this.sandwichSize));
//        System.out.println("Cheese(s) you selected:    " + newSandwich.getCheeseChoices().toString());
//        newSandwich.setSandwichTotal(getSandwichTotal() + cheeseSelections.calculateTotalPrice(this.sandwichSize));
//        System.out.println("sandwich total after cheeses:    $" + newSandwich.getSandwichTotal());

        // Ask user for topping selections - multiple, no extra options
//        newSandwich.setToppingChoices(toppings.getUserChoices(scanner));;
//        System.out.println("Topping(s) you selected:    " + newSandwich.getToppingChoices().toString());

        // Ask user for sauces selections - multiple, no extra options
//        newSandwich.setSauceChoices(sauces.getUserChoices(scanner));;
//        System.out.println("Sauce(s) you selected:    " + newSandwich.getSauceChoices().toString());

        // Ask user for side selections - multiple, no extra options
//        newSandwich.setSideChoices(sides.getUserChoices(scanner));
//        System.out.println("Side(s) you selected:    " + newSandwich.getSideChoices().toString());

        System.out.println("sandwich class total:   $" + newSandwich.getSandwichTotal());
        return newSandwich;
    }

    // update the running total with the cost by size selection
    public Size matchSize(String sizeChoice) {
        switch(sizeChoice) {
            case "1":
                setSandwichSize(Size.SMALL);
                setSandwichTotal(5.5);
            case "2":
                setSandwichSize(Size.MEDIUM);
                setSandwichTotal(7.0);
                break;
            case "3":
                setSandwichSize(Size.LARGE);
                setSandwichTotal(8.5);
                break;
            default:
                System.out.println("Invalid selection - returning to the main menu");
                return null;
        }
        return getSandwichSize();
    }

    // ** HELPER METHODS ** //
    @Override
    public double calculateTotal(Size sandwichSize) {
////        System.out.println("calculate the sandwich total...");
//        double total = this.sandwichTotal;
////        // iterate meat list
//            total += getMeatChoices();
////        // iterate cheese list
////        setSandwichTotal(total);
        return 0;
    };
}
