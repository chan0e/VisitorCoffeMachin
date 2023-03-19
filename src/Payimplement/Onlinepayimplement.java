package Payimplement;

import Acceptor.Pay;
import Visitor.PayMethod;

public class Onlinepayimplement implements PayMethod{

    @Override
    public void pay(Pay pay) {
        // TODO Auto-generated method stub
        System.out.println(pay.getPaymethod() + "로 결제를 진행합니다...");
        System.out.println("결재 완료 !! ");
    }
    
}
