package main.items;

import main.common.types.Item;

public class Consumable extends main.items.Item {

    public Consumable(double cost) {
        super(cost, Item.CONSUMABLES);
    }
}
