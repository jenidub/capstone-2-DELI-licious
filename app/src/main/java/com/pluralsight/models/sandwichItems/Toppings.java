//package com.pluralsight.models.sandwichItems;
//
//import com.pluralsight.utils.PremiumSandwichItem;
//import com.pluralsight.utils.SandwichMenuList;
//import com.pluralsight.utils.Size;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Toppings implements PremiumSandwichItem {
//    // constructor variables
//    ArrayList<String> userChoices = new ArrayList<>();
//
//    // class variables
//    SandwichMenuList sandwichMenuList = new SandwichMenuList();
//    String[] toppingOptions = sandwichMenuList.toppingChoices;
//
//    // constructor
//    public Toppings() {}
//
//    // get user selections for meat
//    @Override
//    public ArrayList<String> getUserChoices(Scanner scanner) {
////        ArrayList<String> userMeatChoices = new ArrayList<String>();
//        boolean isActive = true;
//        while (isActive) {
//            sandwichMenuList.displayChoices(toppingOptions, "TOPPINGS");
//            System.out.println("What topping would you like to add?   ");
//            int userChoice = Integer.parseInt(scanner.nextLine());
//            String toppingChoice = sandwichMenuList.toppingChoices[userChoice - 1];
//            userChoices.add(toppingChoice);
//
//            // ask user if they want to select more meat - if N exit the loop
//            System.out.println("Do you want to select any more toppings for your sandwich?   Y / N ");
//            String userSelection = scanner.nextLine();
//            if (userSelection.equalsIgnoreCase("n")) {
//                isActive = false;
//            }
//        }
//
//        return userChoices;
//    }
//
//}
