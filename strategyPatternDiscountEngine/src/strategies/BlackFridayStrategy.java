package strategies;

import enums.ItemType;
import models.Item;

import java.util.List;

public class BlackFridayStrategy implements DiscountStrategy {

    @Override
    public double applyDiscount(List<Item> items) {
        double discountAmount = 0;

        for(Item item : items) {
            if(item.getType() == ItemType.ELECTRONIC) {
                discountAmount += item.getPrice() * 0.5;
            }
        }

        return discountAmount;
    }
}
