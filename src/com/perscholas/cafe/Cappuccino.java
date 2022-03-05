package com.perscholas.cafe;

import java.util.Scanner;

public class Cappuccino extends Product{
    private boolean peppermint, whippedCream;
    public Cappuccino(){
        this.peppermint = false;
        this.whippedCream = false;
    }

    public Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream) {
        super(name, price, description);
        this.peppermint = peppermint;
        this.whippedCream = whippedCream;
    }

    public boolean isPeppermint() {
        return peppermint;
    }

    public void setPeppermint(boolean peppermint) {
        this.peppermint = peppermint;
    }

    public boolean isWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

    @Override
    public double calculateProductTotal() {
        double price = getPrice() * getQuantity();
        if(peppermint == true) price += getQuantity() * 2.00;
        if(whippedCream == true) price += getQuantity() * 1.00;
        return price;
    }

    @Override
    public void addOptions() {
        Scanner input = new Scanner(System.in);
        // Asking if customer want peppermint
        System.out.print("Would you like some peppermint? ");
        String ans1 = input.nextLine().toLowerCase();
        if(ans1.equals("yes") || ans1.equals("true")) setPeppermint(true);
        // Asking if customer want whipped cream
        System.out.print("Would you like some whipped cream? ");
        String ans2 = input.nextLine().toLowerCase();
        if(ans2.equals("yes") || ans2.equals("true")) setWhippedCream(true);
        // Asking for, and set quantity
        System.out.printf("How many %s do you want to order? ", getName());
        setQuantity(getQuantity() + input.nextInt());
    }

    @Override
    public String printOptions() {
        return String.format("%d %s with %b peppermint and %b whipped cream.", getQuantity(),getName(), isPeppermint(), isWhippedCream());
    }
}
