package strategies;

import enums.ItemType;
import models.Item;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BundleStrategy implements DiscountStrategy {

    @Override
    public double applyDiscount(List<Item> items) {
        List<Item> clothingItems = new ArrayList<>();

        for (Item item : items) {
            if(item.getType() == ItemType.CLOTHING) {
                clothingItems.add(item);
            }
        }

        if(clothingItems.size() < 3) {
            return 0;
        }

        clothingItems.sort(Comparator.comparingDouble(Item::getPrice));

        int groupOfThree = clothingItems.size() / 3;
        double discount = 0;

        for(int i = 0; i < groupOfThree; i++) {
            discount += clothingItems.get(i).getPrice();
        }

        return discount;
    }
}
