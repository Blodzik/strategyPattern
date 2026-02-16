package models;

import enums.ItemType;

public class Item {
    private String name;
    private double price;
    private ItemType type;


    public Item(String name, double price, ItemType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ItemType getType() {
        return type;
    }
}
