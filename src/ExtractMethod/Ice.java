package ExtractMethod;

import Acceptor.Ingredient;
import Visitor.Recipe;

public class Ice implements Recipe {

    @Override
    public void visit(Ingredient ingredient) {
        // TODO Auto-generated method stub
        System.out.println();
        System.out.println(ingredient.getBeragename() + " "+"를 Ice로 추출합니다.");
        System.out.println("컵 나오는 곳에서 플라스틱 컵을 받습니다.");
        System.out.println("얼음 추출대에서 얼음을 받아주세요");
        System.out.println("음료 추출대에서 음료를 받아주세요");

    }
    
    
}
