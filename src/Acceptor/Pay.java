package Acceptor;

import Visitor.PayMethod;

public abstract class Pay {
    protected String paymethod;

    public Pay(String paymethod) {
        this.paymethod = paymethod;
    }

    public String getPaymethod() {
        return paymethod;
    }

    public abstract void accept(PayMethod paymethod);

    
}
