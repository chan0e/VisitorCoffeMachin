package Visitor;

import Acceptor.Ingredient;

public interface Recipe {

    void visit(Ingredient ingredient);
    

}
