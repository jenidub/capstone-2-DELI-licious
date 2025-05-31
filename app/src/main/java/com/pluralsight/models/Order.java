package com.pluralsight.models;

import com.pluralsight.models.orderitems.Chips;
import com.pluralsight.models.orderitems.Drink;
import com.pluralsight.models.orderitems.Sandwich;
import com.pluralsight.utils.OrderItem;

import java.util.ArrayList;

public class Order {
    // class variables
    Chips chips = new Chips();
    Drink drink = new Drink();
    Sandwich sandwich = new Sandwich();

    // constructor variables
    private double orderTotal;
    private ArrayList<OrderItem> itemList;

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

    // methods
    public void addItemToOrder(int itemType) {
        switch (itemType) {
            case 1:
                Sandwich newSandwich = sandwich.addSandwich();
                System.out.println("order class sandwich total:  $" + newSandwich.getSandwichTotal());
                this.itemList.add(newSandwich);
                break;
            case 2:
                this.itemList.add(drink.addDrink());
                break;
            case 3:
                this.itemList.add(chips.addChips());
                break;
        }
//        calculateOrderTotal();
//        displayCurrentOrderTotal();
    }

//    private void calculateOrderTotal() {
//        double total = 0;
//        for (OrderItem item : itemList) {
//            System.out.println(item);
////            total += item.calculateTotal();
//        }
//        setOrderTotal(total);
//    }

    public void displayCurrentOrderTotal() {
        System.out.printf("Current order total: $%.2f\n", getOrderTotal());
    }

    public void clearOrder(){
        this.itemList = new ArrayList<OrderItem>();
        this.orderTotal = 0;
    }

}
