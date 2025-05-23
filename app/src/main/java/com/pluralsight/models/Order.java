package com.pluralsight.models;

import com.pluralsight.utils.OrderItem;
import com.pluralsight.utils.Size;

import java.util.ArrayList;

public class Order {
    // class variables
    Chips chips = new Chips();
    Drink drink = new Drink();

    // constructor variables
    private double orderTotal;
    private ArrayList<OrderItem> itemList = new ArrayList<OrderItem>();

    // constructor
    public Order(double orderTotal, ArrayList<OrderItem> itemList) {
        this.orderTotal = orderTotal;
        this.itemList = itemList;
    }

    // getters/setters
    public double getOrderTotal() {
        return this.orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public ArrayList<OrderItem> getItemList() {
        return itemList;
    }

    public void setCurrentOrder(ArrayList<OrderItem> itemList) {
        this.itemList = itemList;
    }

    // methods
    public void addItemToOrder(int itemType) {
        switch (itemType) {
            case 1:
                System.out.println("adding a sandwich...");
                break;
            case 2:
                itemList.add(drink.addDrink());
                break;
            case 3:
                itemList.add(chips.addChips());
                break;
        }
        setOrderTotal(calculateOrderTotal());
    }

    private double calculateOrderTotal() {
        double total = 0;
        for (OrderItem item : itemList) {
            total += item.calculateTotal();
        }
        return total;
    }

    public void displayCurrentOrderTotal() {
        System.out.printf("Current order total: $%.2f\n", getOrderTotal());
    }

    public void clearOrder(){
        this.itemList = new ArrayList<OrderItem>();
        this.orderTotal = 0;
    }

}
