package Paymethods;

import Acceptor.Pay;
import Visitor.PayMethod;

public class Onlinepay  extends Pay{

    public Onlinepay(String paymethod) {
        super(paymethod);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void accept(PayMethod paymethod) {
        // TODO Auto-generated method stub
        paymethod.pay(this);
    }
    
}
