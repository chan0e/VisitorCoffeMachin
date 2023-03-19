package Berages;

import Acceptor.Ingredient;
import Visitor.Recipe;

public class Berage extends Ingredient {

    public Berage(String beragename, int price) {
        super(beragename, price);
        // TODO Auto-generated constructor stub

    }

    @Override
    public void accept(Recipe recipe) {
        // TODO Auto-generated method stub
        recipe.visit(this);
    }

}
