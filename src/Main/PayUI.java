package Main;

import java.util.Scanner;

import Payimplement.*;
import Paymethods.*;

public class PayUI {
    Scanner sc;
    public PayUI(){
        sc = new Scanner(System.in);
        
        System.out.println("결제할 방법을 골라주세요 ");
        System.out.println("1. 카드  2. 현금  3. 온라인페이");
        System.out.print("Client >> ");
        int number = sc.nextInt();
        switch(number){
            case 1:
                new Card("카드").accept(new Cardimplement());
                break;

            case 2:
            new Cash("현금").accept(new Cashimplement());
            break;

            case 3:
            new Onlinepay("온라인페이").accept(new Onlinepayimplement());
            break;
        }

        sc.close();
    }

}
