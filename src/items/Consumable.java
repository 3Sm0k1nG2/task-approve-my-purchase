package items;

import common.Type;

public class Consumable extends items.Item {

    public Consumable(double cost) {
        super(cost, Type.CONSUMABLES.CONSUMABLES);
    }
}
