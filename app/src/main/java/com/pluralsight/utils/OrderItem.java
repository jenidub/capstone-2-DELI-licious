package com.pluralsight.utils;

//public abstract class OrderItem {
//    public double calculateTotal(ArrayList<OrderItem> itemList) {
//        double total = 0;
//        System.out.println("calculating total...");
//        return total;
//    }
//}

public interface OrderItem  {
    String itemName = "";

    double calculateTotal(Size sandwichSize);
}
