//package com.pluralsight.models.sandwichItems;
//
//import com.pluralsight.utils.PremiumSandwichItem;
//import com.pluralsight.utils.SandwichMenuList;
//import com.pluralsight.utils.Size;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Sides implements PremiumSandwichItem {
//    // constructor variables
//    ArrayList<String> userChoices = new ArrayList<>();
//
//    // class variables
//    SandwichMenuList sandwichMenuList = new SandwichMenuList();
//    String[] sideChoices = sandwichMenuList.sideChoices;
//
//    // constructor
//    public Sides() {}
//
//    // get user selections for meat
//    @Override
//    public ArrayList<String> getUserChoices(Scanner scanner) {
//        boolean isActive = true;
//        while (isActive) {
//            sandwichMenuList.displayChoices(sideChoices, "SIDES");
//            System.out.println("What side would you like to add?   ");
//            int userChoice = Integer.parseInt(scanner.nextLine());
//
//            if (userChoice == 3) {
//                return userChoices;
//            } else {
//                String sideChoice = sandwichMenuList.sideChoices[userChoice - 1];
//                userChoices.add(sideChoice);
//            }
//
//            // ask user if they want to select more sides - if N exit the loop
//            System.out.println("Do you want to select another side for your sandwich?   Y / N ");
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
