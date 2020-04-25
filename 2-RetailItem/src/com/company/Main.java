package com.company;
public class Main {

    public static void main(String[] args) {
	    RetailItem r[] = new RetailItem[3];
	    r[0] = new RetailItem("Jacket", 12, 59.95);
        r[1] = new RetailItem("Jeans", 40, 34.95);
        r[2] = new RetailItem("Shirt", 20, 24.95);

        System.out.println("-------------------------------------------------");
        System.out.println("\t\t Description \t Units on Hand \t Price");
        System.out.println("-------------------------------------------------");

        for(int i = 0; i < r.length; i++){
            System.out.println("Item "+i+" \t "+ r[i].description +" \t\t\t "+ r[i].unitsOnHand +" \t\t "+ r[i].price);
        }
        System.out.println("-------------------------------------------------");
    }
}
