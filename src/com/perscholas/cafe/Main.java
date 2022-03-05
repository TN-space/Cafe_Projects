package com.perscholas.cafe;

import java.util.LinkedList;
import java.util.List;
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
//        Coffee coffee = new Coffee("coffee", 2.50, "hot coffee", false, false);
//        Espresso espresso = new Espresso("espresso", 4.50, "hot coffee with a shot of espresso",false, false);
//        Cappuccino cappuccino = new Cappuccino("cappuccino", 5.50, "made with whole milk and a shot of espresso",false, false);
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Hello, what would you like to order today? ");
//        String order = (input.nextLine()).toLowerCase();
//
//        if(order.equals("coffee")) {
//            // Asking if customer want sugar
//            System.out.println("Would you like some sugar in it? ");
//            String ans1 = input.nextLine().toLowerCase();
//            if(ans1.equals("yes") || ans1.equals("true")) coffee.setSugar(true);
//
//            // Asking if customer want milk
//            System.out.println("Would you like milk in it? ");
//            String ans2 = input.nextLine().toLowerCase();
//            if(ans2.equals("yes") || ans2.equals("true")) coffee.setMilk(true);
//
//            // Asking for and set quantity
//            System.out.printf("How many %s do you want to order? ", coffee.getName());
//            coffee.setQuantity(input.nextInt());
//            // doing calculations
//            double total = coffee.calculateProductTotal();
//            double change = (total - (int)total) * 100;
//            System.out.printf("Your total order is %d dollars and %d cents.",(int)total, (int)change);
//        } else if(order.equals("espresso")) {
//            // Asking if customer want an extraShot
//            System.out.println("Do you want an extra shot of espresso? ");
//            String ans1 = input.nextLine().toLowerCase();
//            if(ans1.equals("yes") || ans1.equals("true")) espresso.setExtraShot(true);
//
//            // Asking if customer want macchiato style
//            System.out.println("Do you like it done macchiato style? ");
//            String ans2 = input.nextLine().toLowerCase();
//            if(ans2.equals("yes") || ans2.equals("true")) espresso.setMacchiato(true);
//
//            // Asking for and set quantity
//            System.out.printf("How many %s do you want to order? ", espresso.getName());
//            espresso.setQuantity(input.nextInt());
//            // doing calculations
//            double total = espresso.calculateProductTotal();
//            double change = (total - (int)total) * 100;
//            System.out.printf("Your total order is %d dollars and %d cents.",(int)total, (int)change);
//        } else if(order.equals("cappuccino")) {
//            // Asking if customer want peppermint
//            System.out.println("Would you like some peppermint in it? ");
//            String ans1 = input.nextLine().toLowerCase();
//            if(ans1.equals("yes") || ans1.equals("true")) cappuccino.setPeppermint(true);
//
//            // Asking if customer want whippedCream
//            System.out.println("Would you like some whipped cream? ");
//            String ans2 = input.nextLine().toLowerCase();
//            if(ans2.equals("yes") || ans2.equals("true")) cappuccino.setWhippedCream(true);
//
//            // Asking for and set quantity
//            System.out.printf("How many %s do you want to order? ", cappuccino.getName());
//            cappuccino.setQuantity(input.nextInt());
//            // doing calculations
//            double total = cappuccino.calculateProductTotal();
//            double change = (total - (int)total) * 100;
//            System.out.printf("Your total order is %d dollars and %d cents.",(int)total, (int)change);
//        } else {
//            System.out.println("I apologize, the item you ordered is not available at the moment.");
//        }
        // Project 2============================================End

        // Project 3============================================Start
        Coffee coffee = new Coffee("coffee", 2.50, "hot coffee", false, false);
        Espresso espresso = new Espresso("espresso", 4.50, "hot coffee with a shot of espresso",false, false);
        Cappuccino cappuccino = new Cappuccino("cappuccino", 5.50, "made with whole milk and a shot of espresso",false, false);
        // Declare a new LinkedList name menu
        List<Product> menu = new LinkedList<>();
        // add new links
        menu.add(coffee);
        menu.add(espresso);
        menu.add(cappuccino);

        Scanner input = new Scanner(System.in);

        double total = 0;
        boolean isContinue = true;

        do {
            // Display all the options in menu LinkedList
            for (int i = 0; i < menu.size() ; i++) {
                String name = menu.get(i).getName();
                System.out.printf("%d: %s \n", i+1, name.substring(0,1).toUpperCase() + name.substring(1));
            }
            // The last option is to check out
            System.out.printf("%d: Check Out\n",menu.size()+1);
            // Asking for a selection
            System.out.print("Please select from the menu: ");
            // saving the selection into variable pick
            int pick = input.nextInt();
            // an extra input.nextLine() end the Scanner intaking line.
            input.nextLine();
            // Run pick variable through a switch case
            switch (pick) {
                case 1:
                    // call addOptions() method in coffee object,
                    // which asks customer if they want to add sugar and/or milk.
                    coffee.addOptions();
                    // call calculateProductTotal() method in coffee object,
                    // which returns a double and then add to variable total.
                    total += coffee.calculateProductTotal();
                    break;
                case 2:
                    // call addOptions() method in espresso object,
                    // which asks customer if they want to add another shot of espresso and/or macchiato style.
                    espresso.addOptions();
                    // call calculateProductTotal() method in espresso object,
                    // which returns a double and then add to variable total.
                    total += espresso.calculateProductTotal();
                    break;
                case 3:
                    // call addOptions() method in espresso object
                    // which asks customer if they want to add peppermint and/or whipped cream.
                    cappuccino.addOptions();
                    // call calculateProductTotal() method in espresso object,
                    // which returns a double and then add to variable total.
                    total += cappuccino.calculateProductTotal();
                    break;
                case 4:
                    // When option 4 is chosen, check out, show customer what they had ordered and total
                    System.out.println("You ordered:");
                    if(coffee.getQuantity() > 1) System.out.println(coffee.printOptions());
                    if(espresso.getQuantity() > 1) System.out.println(espresso.printOptions());
                    if(cappuccino.getQuantity() > 1) System.out.println(cappuccino.printOptions());
                    System.out.printf("Your total order is %.2f.\n", total);
                    // set isContinue condition to false to end do-while loop.
                    isContinue = false;
                    break;
                default:
                    System.out.println("We currently do not have that option. Please choose other options.");
            }
            // Check if isContinue is already false (if already chose check out), then break and not execute the rest
            if(!isContinue) break;
            // Ask if customer want to order more - the rest of the block on the run if isContinue isn't false
            System.out.print("Would you like to order more? ");
            String ans = input.nextLine().toLowerCase();
            // If customer chooses not to continue at this stage, show them their order and total.
            if(ans.equals("no") || ans.equals("false")) {
                System.out.println("You ordered:");
                if(coffee.getQuantity() > 1) System.out.println(coffee.printOptions());
                if(espresso.getQuantity() > 1) System.out.println(espresso.printOptions());
                if(cappuccino.getQuantity() > 1) System.out.println(cappuccino.printOptions());
                System.out.printf("Your total order is %.2f", total);
                // set isContinue condition to false to beak out of do-while loop.
                isContinue = false;
            }
        } while(isContinue);
        // Project 3============================================End
    }
}
