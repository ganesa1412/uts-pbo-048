package com.company;

public class RetailItem {
    public String description;
    public int unitsOnHand;
    public double price;

//    Constructor
    public RetailItem(String description, int unitsOnHand, double price){
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }

}
