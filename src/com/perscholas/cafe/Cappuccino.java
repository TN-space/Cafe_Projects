package com.perscholas.cafe;

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
        if(peppermint == true) price += 2.00;
        if(whippedCream == true) price += 1.00;
        return price;
    }
}
