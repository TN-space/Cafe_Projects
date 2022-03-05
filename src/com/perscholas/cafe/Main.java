package com.perscholas.cafe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Product coffee = new Product("coffee", 2.50, "hot coffee");
        Product espresso = new Product("espresso", 4.50, "hot coffee with a shot of espresso");
        Product cappuccino = new Product("cappuccino", 5.50, "made with whole milk and a shot of espresso");

        Scanner input = new Scanner(System.in);
        System.out.print("Hello, what would you like to order today? ");
        String order = (input.nextLine()).toLowerCase();
//        double total = 0;

        // Code works, but Very repetitive code, I would like to implement a template for each item later.
        if(order.equals("coffee")) {
            System.out.printf("How many %s do you want to order? ", coffee.getName());
            coffee.setQuantity(input.nextInt());
            double total = coffee.calculateProductTotal();
            double change = (total - (int)total) * 100;
            System.out.printf("Your total order is %d dollars and %d cents.",(int)total, (int)change);
        } else if(order.equals("espresso")) {
            System.out.printf("How many %s do you want to order? ", espresso.getName());
            espresso.setQuantity(input.nextInt());
            double total = espresso.calculateProductTotal();
            double change = (total - (int)total) * 100;
            System.out.printf("Your total order is %d dollars and %d cents.",(int)total, (int)change);
        } else if(order.equals("cappuccino")) {
            System.out.printf("How many %s do you want to order? ", cappuccino.getName());
            cappuccino.setQuantity(input.nextInt());
            double total = cappuccino.calculateProductTotal();
            double change = (total - (int)total) * 100;
            System.out.printf("Your total order is %d dollars and %d cents.",(int)total, (int)change);
        } else {
            System.out.println("I apologize, the item you ordered is not available at the moment.");
        }
    }
}
