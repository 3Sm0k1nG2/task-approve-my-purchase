package items;

import common.types.Item;

public class Consumable extends items.Item {

    public Consumable(double cost) {
        super(cost, Item.CONSUMABLES);
    }
}
