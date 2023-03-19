package ExtractMethod;

import Acceptor.Ingredient;
import Visitor.Recipe;

public class Hot implements Recipe {

    @Override
    public void visit(Ingredient ingredient) {
        // TODO Auto-generated method stub
        System.out.println();
        System.out.println(ingredient.getBeragename() + " " + "를 Hot으로 추출합니다.");
        
        System.out.println("컵 나오는 곳에서 종이컵을 받아주세요");
        System.out.println("음료 추출대에서 음료를 받아주세요");
        System.out.println("화상을 입지않도록 유의해주세요");

    }

}
