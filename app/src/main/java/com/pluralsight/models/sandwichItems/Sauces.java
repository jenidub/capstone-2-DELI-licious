//package com.pluralsight.models.sandwichItems;
//
//import com.pluralsight.utils.PremiumSandwichItem;
//import com.pluralsight.utils.SandwichMenuList;
//import com.pluralsight.utils.Size;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Sauces implements PremiumSandwichItem {
//    // constructor variables
//    ArrayList<String> userChoices = new ArrayList<>();
//
//    // class variables
//    SandwichMenuList sandwichMenuList = new SandwichMenuList();
//    String[] sauceChoices = sandwichMenuList.sauceChoices;
//
//    // constructor
//    public Sauces() {}
//
//    // get user selections for meat
//    @Override
//    public ArrayList<String> getUserChoices(Scanner scanner) {
////        ArrayList<String> userMeatChoices = new ArrayList<String>();
//        boolean isActive = true;
//        while (isActive) {
//            sandwichMenuList.displayChoices(sauceChoices, "SAUCES");
//            System.out.println("What sauce would you like to add?   ");
//            int userChoice = Integer.parseInt(scanner.nextLine());
//            String sauceChoice = sandwichMenuList.sauceChoices[userChoice - 1];
//            userChoices.add(sauceChoice);
//
//            // ask user if they want to select more meat - if N exit the loop
//            System.out.println("Do you want to select any more sauces for your sandwich?   Y / N ");
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
