package com.pluralsight.utils;

import com.pluralsight.models.orderitems.Sandwich;

import java.util.ArrayList;
import java.util.Scanner;

public interface PremiumSandwichItem {
    ArrayList<String> userChoices = new ArrayList<>();
    double smallPrice = 0;
    double mediumPrice = 0;
    double largePrice = 0;
    double smallExtra = 0;
    double mediumExtra = 0;
    double largeExtra = 0;

    public ArrayList<String> getUserChoices(Scanner scanner, Size sandwichSize);
    public double calculateTotalPrice(Size sandwichSize);
}