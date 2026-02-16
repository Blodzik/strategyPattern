package strategies;

import models.Item;

import java.util.List;

public interface DiscountStrategy {
    double applyDiscount(List<Item> items);
}
