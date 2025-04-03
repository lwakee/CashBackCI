package org.example;

public class CashBackService {
    public double cashBackCalculation(double purchaseAmount,boolean subscribed) {
        double bonus;
        if (subscribed) {
            bonus = (double) (purchaseAmount * 0.05);
        } else {
            bonus = (double) (purchaseAmount * 0.01);
        }
        if (bonus > 5000){
            bonus = 5000;
        }
        return bonus;
    }
}
