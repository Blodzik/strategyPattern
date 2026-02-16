import concreteStrategies.CreditCardPayment;
import concreteStrategies.PayPalPayment;
import context.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment("Visa", "12313231312");
        PayPalPayment payPalPayment = new PayPalPayment("tsokalonazar@gmail.com");
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(100);
        shoppingCart.addItem(200);
        shoppingCart.pay(creditCardPayment);
        shoppingCart.pay(payPalPayment);
    }
}