package com.pluralsight.models.sandwichItems;

import com.pluralsight.utils.PremiumSandwichItem;
import com.pluralsight.utils.SandwichMenuList;
import com.pluralsight.utils.Size;

import java.util.ArrayList;
import java.util.Scanner;

public class Cheese implements PremiumSandwichItem {
    // constructor variables
    private ArrayList<String> cheeseList = new ArrayList<>();
    private double cheeseTotal;

    private final double smallNoExtra = .75;
    private final double mediumNoExtra = 1.5;
    private final double largeNoExtra = 2.25;
    private final double smallExtra = 0.3;
    private final double mediumExtra = 0.6;
    private final double largeExtra = 0.9;

    // class variables
    SandwichMenuList sandwichMenuList = new SandwichMenuList();
    String[] cheeseOptions = sandwichMenuList.cheeseChoices;

    // constructors
    public Cheese(ArrayList<String> cheeseList, double cheeseTotal) {
        this.cheeseList = cheeseList;
        this.cheeseTotal = cheeseTotal;
    }

    public Cheese() {}

    // getters/setters
    public ArrayList<String> getCheeseList() {
        return cheeseList;
    }

    public void setCheeseList(ArrayList<String> cheeseList) {
        this.cheeseList = cheeseList;
    }

    public double getCheeseTotal() {
        return cheeseTotal;
    }

    public void setCheeseTotal(double cheeseTotal) {
        this.cheeseTotal = cheeseTotal;
    }

    // get user selections for meat
    @Override
    public ArrayList<String> getUserChoices(Scanner scanner, Size sandwichSize) {
        boolean isActive = true;
        while (isActive) {
            sandwichMenuList.displayChoices(cheeseOptions, "CHEESE");
            System.out.println("What cheese would you like to add?   ");
            int userChoice = Integer.parseInt(scanner.nextLine());
            String cheeseChoice = sandwichMenuList.cheeseChoices[userChoice - 1];

            System.out.println("""
                    Do you want extra cheese?
                    [1] Yes
                    [2] No
            """);
            String extraChoice = scanner.nextLine();
            boolean isExtra = extraChoice.equals("1") || extraChoice.equalsIgnoreCase("y") || extraChoice.equalsIgnoreCase("yes");

            String entry = isExtra ? cheeseChoice + "*" : cheeseChoice;
            userChoices.add(entry);

            // ask user if they want to select more meat - if N exit the loop
            System.out.println("Do you want to select any more cheese for your sandwich?   Y / N ");
            String userSelection = scanner.nextLine();
            if (userSelection.equalsIgnoreCase("n")) {
                isActive = false;
            }
        }

        setCheeseList(userChoices);
        return userChoices;
    }

    @Override
    public double calculateTotalPrice(Size sandwichSize) {
        double total = 0;
        for (String cheese: getCheeseList()) {
            boolean lastChar = cheese.endsWith("*");
            switch(sandwichSize) {
                case SMALL:
                    total += lastChar ? smallExtra : smallNoExtra;
                    break;
                case MEDIUM:
                    total +=  lastChar ? mediumExtra : mediumNoExtra;
                    break;
                case LARGE:
                    total +=  lastChar ? largeExtra : largeNoExtra;
                    break;
            }
        }
        return total;
    }

}
