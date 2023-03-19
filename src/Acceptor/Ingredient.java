package Acceptor;

import Visitor.Recipe;

public abstract class Ingredient {
    
    protected String beragename;
    protected static int Price;

    public Ingredient(String beragename, int Price) {
        this.beragename = beragename;
        this.Price = Price;
    }

    public String getBeragename() {
        return beragename;
    }

    public static int getPrice() {
        return Price;
    }

    public abstract void accept(Recipe recipe);
    

}
