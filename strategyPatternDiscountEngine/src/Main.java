import context.Order;
import enums.ItemType;
import models.Item;
import strategies.BlackFridayStrategy;
import strategies.BundleStrategy;
import strategies.NewCustomerStrategy;

public class Main {
    public static void main(String[] args) {
        Order cart = new Order();
        cart.add(new Item("MacBook", 2000.00, ItemType.ELECTRONIC));
        cart.add(new Item("T-Shirt", 20.00, ItemType.CLOTHING));
        cart.add(new Item("Jeans", 50.00, ItemType.CLOTHING));
        cart.add(new Item("Banana", 1.50, ItemType.FOOD));

        BlackFridayStrategy blackFridayStrategy = new BlackFridayStrategy();
        BundleStrategy bundleStrategy = new BundleStrategy();
        NewCustomerStrategy newCustomerStrategy = new NewCustomerStrategy();

        System.out.println(cart.getFinalPrice(blackFridayStrategy));
        System.out.println(cart.getFinalPrice(bundleStrategy));
        System.out.println(cart.getFinalPrice(newCustomerStrategy));
    }
}