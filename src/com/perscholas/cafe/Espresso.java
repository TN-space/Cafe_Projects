package com.perscholas.cafe;

import java.util.Scanner;

public class Espresso extends Product{
    private boolean extraShot, macchiato;
    public Espresso() {
        this.extraShot = false;
        this.macchiato = false;
    }

    public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
        super(name, price, description);
        this.extraShot = extraShot;
        this.macchiato = macchiato;
    }

    public boolean isExtraShot() {
        return extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean isMacchiato() {
        return macchiato;
    }

    public void setMacchiato(boolean macchiato) {
        this.macchiato = macchiato;
    }

    @Override
    public double calculateProductTotal() {
        double price = getPrice() * getQuantity();
        if(extraShot == true) price += getQuantity() * 2.00;
        if(macchiato == true) price += getQuantity() * 1.00;
        return price;
    }

    @Override
    public void addOptions() {
        Scanner input = new Scanner(System.in);
        // Asking if customer want an extra shot of espresso
        System.out.print("Would you like an extra shot of espresso? ");
        String ans1 = input.nextLine().toLowerCase();
        if(ans1.equals("yes") || ans1.equals("true")) setExtraShot(true);
        // Asking if customer macchiato style
        System.out.print("Would you like it done macchiato style? ");
        String ans2 = input.nextLine().toLowerCase();
        if(ans2.equals("yes") || ans2.equals("true")) setMacchiato(true);
        // Asking for, and set quantity
        System.out.printf("How many %s do you want to order? ", getName());
        setQuantity(getQuantity() + input.nextInt());
    }

    @Override
    public String printOptions() {
        return String.format("%d %s with %b extra shot and %b macchiato style.", getQuantity(),getName(), isExtraShot(), isMacchiato());
    }
}
