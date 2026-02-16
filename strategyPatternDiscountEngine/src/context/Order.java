package context;

import models.Item;
import strategies.DiscountStrategy;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;

    public Order() {
        items = new ArrayList<>();
    }

    public Order(List<Item> items) {
        this.items = items;
    }

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
    }

    public double getDiscount(DiscountStrategy discountStrategy) {
        return discountStrategy.applyDiscount(items);
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public double getFinalPrice(DiscountStrategy discountStrategy) {
       double discount = discountStrategy.applyDiscount(this.items);
       double total = calculateTotal();
       return total - discount;
    }
}
