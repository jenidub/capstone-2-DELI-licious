package com.pluralsight;

public class Sandwich extends OrderItem {
    private String breadChoice;
    private String[] meatChoices, cheeseChoices, toppingChoices, sauceChoices, sideChoices;

    public Sandwich() {
        super();
    }

    SandwichItemList menu = new SandwichItemList();
}
