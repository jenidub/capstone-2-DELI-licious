package com.pluralsight.models.sandwichItems;

import com.pluralsight.utils.PremiumSandwichItem;
import com.pluralsight.utils.SandwichMenuList;
import com.pluralsight.utils.Size;

import java.util.ArrayList;
import java.util.Scanner;

public class Meat implements PremiumSandwichItem {
    // constructor variables
    private ArrayList<String> meatList;
    double meatTotal;

    private final double smallNoExtra = 1;
    private final double mediumNoExtra = 2;
    private final double largeNoExtra = 3;
    private final double smallExtra = 1.5;
    private final double mediumExtra = 3;
    private final double largeExtra = 4.5;

    // class variables
    SandwichMenuList sandwichMenuList = new SandwichMenuList();
    String[] meatOptions = sandwichMenuList.meatChoices;

    // constructor
    public Meat(ArrayList<String> meatList, double meatTotal) {
        this.meatList = meatList;
        this.meatTotal = meatTotal;
    }

    public Meat() {}

    // getter/setter
    public ArrayList<String> getMeatList() {
        return meatList;
    }

    public void setMeatList(ArrayList<String> meatList) {
        this.meatList = meatList;
    }

    public double getMeatTotal() {
        return meatTotal;
    }

    public void setMeatTotal(double meatTotal) {
        this.meatTotal = meatTotal;
    }

    // get user selections for meat
    @Override
    public ArrayList<String> getUserChoices(Scanner scanner, Size sandwichSize) {
        boolean isActive = true;

        while (isActive) {
                double cost = 0;
                sandwichMenuList.displayChoices(meatOptions, "MEAT");
                System.out.println("What meat would you like to add?   ");
                int userChoice = Integer.parseInt(scanner.nextLine());
                String meatChoice = sandwichMenuList.meatChoices[userChoice - 1];

                System.out.println("""
                                Do you want extra meat?
                                [1] Yes
                                [2] No
                        """);
                String extraChoice = scanner.nextLine();
                boolean isExtra = extraChoice.equals("1") || extraChoice.equalsIgnoreCase("y") || extraChoice.equalsIgnoreCase("yes");

                String entry = isExtra ? meatChoice + "*" : meatChoice;
                userChoices.add(entry);

                // ask user if they want to select more meat - if N exit the loop
                System.out.println("Do you want to select any more meat for your sandwich?   Y / N ");
                String userSelection = scanner.nextLine();
                if (userSelection.equalsIgnoreCase("n")) {
                    isActive = false;
                }
        }

        setMeatList(userChoices);
        return userChoices;
    }

    @Override
    public double calculateTotalPrice(Size sandwichSize) {
        double total = 0;
        for (String meat: getMeatList()) {
            boolean lastChar = meat.endsWith("*");
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
