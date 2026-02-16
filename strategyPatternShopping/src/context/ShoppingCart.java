package context;

import concreteStrategies.PaymentStrategy;

public class ShoppingCart {
    private int total;

    public void addItem(int price) {
        total += price;
    }


    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(total);
    }
}
