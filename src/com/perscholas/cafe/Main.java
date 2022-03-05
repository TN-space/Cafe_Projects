package com.perscholas.cafe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Code works, but Very repetitive code, I would like to implement a template for each item later.

        // Project 1============================================Start
//        Product coffee = new Product("coffee", 2.50, "hot coffee");
//        Product espresso = new Product("espresso", 4.50, "hot coffee with a shot of espresso");
//        Product cappuccino = new Product("cappuccino", 5.50, "made with whole milk and a shot of espresso");
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Hello, what would you like to order today? ");
//        String order = (input.nextLine()).toLowerCase();
////        double total = 0;
//
//        if(order.equals("coffee")) {
//            System.out.printf("How many %s do you want to order? ", coffee.getName());
//            coffee.setQuantity(input.nextInt());
//            double total = coffee.calculateProductTotal();
//            double change = (total - (int)total) * 100;
//            System.out.printf("Your total order is %d dollars and %d cents.",(int)total, (int)change);
//        } else if(order.equals("espresso")) {
//            System.out.printf("How many %s do you want to order? ", espresso.getName());
//            espresso.setQuantity(input.nextInt());
//            double total = espresso.calculateProductTotal();
//            double change = (total - (int)total) * 100;
//            System.out.printf("Your total order is %d dollars and %d cents.",(int)total, (int)change);
//        } else if(order.equals("cappuccino")) {
//            System.out.printf("How many %s do you want to order? ", cappuccino.getName());
//            cappuccino.setQuantity(input.nextInt());
//            double total = cappuccino.calculateProductTotal();
//            double change = (total - (int)total) * 100;
//            System.out.printf("Your total order is %d dollars and %d cents.",(int)total, (int)change);
//        } else {
//            System.out.println("I apologize, the item you ordered is not available at the moment.");
//        }
        // Project 1============================================End

        // Project 2============================================Start
        Coffee coffee = new Coffee("coffee", 2.50, "hot coffee", false, false);
        Espresso espresso = new Espresso("espresso", 4.50, "hot coffee with a shot of espresso",false, false);
        Cappuccino cappuccino = new Cappuccino("cappuccino", 5.50, "made with whole milk and a shot of espresso",false, false);

        Scanner input = new Scanner(System.in);
        System.out.print("Hello, what would you like to order today? ");
        String order = (input.nextLine()).toLowerCase();

        if(order.equals("coffee")) {
            // Asking if customer want sugar
            System.out.println("Would you like some sugar in it? ");
            String ans1 = input.nextLine();
            if(ans1.equals("yes") || ans1.equals("true")) coffee.setSugar(true);

            // Asking if customer want milk
            System.out.println("Would you like milk in it? ");
            String ans2 = input.nextLine();
            if(ans2.equals("yes") || ans2.equals("true")) coffee.setMilk(true);

            // Asking for and set quantity
            System.out.printf("How many %s do you want to order? ", coffee.getName());
            coffee.setQuantity(input.nextInt());
            // doing calculations
            double total = coffee.calculateProductTotal();
            double change = (total - (int)total) * 100;
            System.out.printf("Your total order is %d dollars and %d cents.",(int)total, (int)change);
        } else if(order.equals("espresso")) {
            // Asking if customer want an extraShot
            System.out.println("Do you want an extra shot of espresso? ");
            String ans1 = input.nextLine();
            if(ans1.equals("yes") || ans1.equals("true")) espresso.setExtraShot(true);

            // Asking if customer want macchiato style
            System.out.println("Do you like it done macchiato style? ");
            String ans2 = input.nextLine();
            if(ans2.equals("yes") || ans2.equals("true")) espresso.setMacchiato(true);

            // Asking for and set quantity
            System.out.printf("How many %s do you want to order? ", espresso.getName());
            espresso.setQuantity(input.nextInt());
            // doing calculations
            double total = espresso.calculateProductTotal();
            double change = (total - (int)total) * 100;
            System.out.printf("Your total order is %d dollars and %d cents.",(int)total, (int)change);
        } else if(order.equals("cappuccino")) {
            // Asking if customer want peppermint
            System.out.println("Would you like some peppermint in it? ");
            String ans1 = input.nextLine();
            if(ans1.equals("yes") || ans1.equals("true")) cappuccino.setPeppermint(true);

            // Asking if customer want whippedCream
            System.out.println("Would you like some whipped cream? ");
            String ans2 = input.nextLine();
            if(ans2.equals("yes") || ans2.equals("true")) cappuccino.setWhippedCream(true);

            // Asking for and set quantity
            System.out.printf("How many %s do you want to order? ", cappuccino.getName());
            cappuccino.setQuantity(input.nextInt());
            // doing calculations
            double total = cappuccino.calculateProductTotal();
            double change = (total - (int)total) * 100;
            System.out.printf("Your total order is %d dollars and %d cents.",(int)total, (int)change);
        } else {
            System.out.println("I apologize, the item you ordered is not available at the moment.");
        }
        // Project 2============================================End
    }
}
