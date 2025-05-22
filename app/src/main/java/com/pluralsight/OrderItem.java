package com.pluralsight;

import java.util.ArrayList;

public abstract class OrderItem {
    public double calculateTotal(ArrayList<OrderItem> itemList) {
        double total = 0;
        System.out.println("calculating total...");
        return total;
    }
}
