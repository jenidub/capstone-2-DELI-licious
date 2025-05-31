package com.pluralsight.utils;

import java.util.Arrays;

public class SandwichMenuList {
    public String[] breadChoices = {"Wheat", "White", "Rye", "Wrap"};
    public String[] meatChoices = {"Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon"};
    public String[] cheeseChoices = {"American", "Provolone", "Cheddar", "Swiss"};
    public String[] toppingChoices = {"Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapenos", "Cucumbers", "Pickles", "Guacamole", "Mushrooms"};
    public String[] sauceChoices = {"Mayonnaise", "Mustard", "Ketchup", "Ranch", "1000 Island", "Vinaigrette"};
    public String[] sideChoices = {"Au Jus", "Sauce", "None"};

    public SandwichMenuList(){}

    public void displayChoices(String[] choiceMenu, String category) {
        System.out.printf("Here are the available options for %s:\n", category);

        for (int i = 1; i <= choiceMenu.length; i++) {
            System.out.printf("[%d]    %s", i, choiceMenu[i - 1]);
            System.out.println();
        }
    }
}
