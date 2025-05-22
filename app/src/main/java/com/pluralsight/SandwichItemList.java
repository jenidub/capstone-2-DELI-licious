package com.pluralsight;

public class SandwichItemList {
    public static String[] breadChoices = {"Wheat", "White", "Rye", "Wrap"};
    public static String[] meatChoices = {"Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon"};
    public static String[] cheeseChoices = {"American", "Provolone", "Cheddar", "Swiss"};
    public static String[] toppingChoices = {"Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapenos", "Cucumbers", "Pickles", "Guacamole", "Mushrooms"};
    public static String[] sauceChoices = {"Mayonnaise", "Mustard", "Ketchup", "Ranch", "1000 Island", "Vinaigrette"};
    public static String[] sideChoices = {"Au Jus", "Sauce"};

    private void displayChoices(String[] itemMenu, String category) {
        System.out.printf("Here are the available options for %s:", category);
        for (String item : itemMenu) {
            System.out.printf("* %s", item);
            System.out.println();
        }
    }
}
