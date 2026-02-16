package strategies;

import models.Item;

import java.util.List;

public class NewCustomerStrategy implements DiscountStrategy {

    @Override
    public double applyDiscount(List<Item> items) {
        double total = 0;

        for (Item item : items) {
            total += item.getPrice();
        }

        if(total > 100) {
            return total * 0.2;
        } else {
            return 0;
        }
    }
}
