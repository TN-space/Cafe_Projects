package com.perscholas.cafe;

import java.util.Scanner;

public class Coffee extends Product{
    private boolean sugar, milk;

    public Coffee() {
        this.sugar = false;
        this.milk = false;
    }

    public Coffee(String name, double price, String description, boolean sugar, boolean milk) {
        super(name, price, description);
        this.sugar = sugar;
        this.milk = milk;
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    @Override
    public double calculateProductTotal() {
        return getPrice() * getQuantity();
    }

    @Override
    public void addOptions() {
        Scanner input = new Scanner(System.in);
        // Asking if customer want sugar
        System.out.print("Would you like sugar with the coffee? ");
        String ans1 = input.nextLine().toLowerCase();
        if(ans1.equals("yes") || ans1.equals("true")) setSugar(true);
        // Asking if customer want milk
        System.out.print("Would you like milk with the coffee? ");
        String ans2 = input.nextLine().toLowerCase();
        if(ans2.equals("yes") || ans2.equals("true")) setMilk(true);
        // Asking for, and set quantity
        System.out.printf("How many %s do you want to order? ", getName());
        setQuantity(getQuantity() + input.nextInt());
    }

    @Override
    public String printOptions() {
        return String.format("%d %s with %b sugars and %b milk.", getQuantity(),getName(), isSugar(), isMilk());
    }
}
