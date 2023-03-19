package Payimplement;

import java.util.Scanner;

import Acceptor.Ingredient;
import Acceptor.Pay;
import Visitor.PayMethod;

public class Cashimplement implements PayMethod {
    Scanner sc;
    @Override
    public void pay(Pay pay) {
        // TODO Auto-generated method stub
        sc = new Scanner(System.in);
        System.out.println(pay.getPaymethod() + "로 결제를 진행합니다...");
        System.out.println("결제해야할 금액 : " + Ingredient.getPrice());
        System.out.println("얼마를 투입하시겠습니까?");
        System.out.print("Client >> ");
        int money = sc.nextInt();
        
        System.out.println();
        
        System.out.println("투입하신 요금은 " + money + " 입니다.");
        System.out.println("거스름돈은 " + Math.abs(money-Ingredient.getPrice()) + "입니다." );
        System.out.println("500원 x"+ Math.abs(money-Ingredient.getPrice()) / 500 
                                + " 100원 x" + Math.abs(money-Ingredient.getPrice()) % 500 / 100
                                + " 10원 x" + Math.abs(money-Ingredient.getPrice()) % 500 % 100 / 10 );

        
    }
    
}
