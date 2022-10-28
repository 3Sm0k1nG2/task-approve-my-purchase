package requests;

import common.Type;

public class Consumable extends Request{
    public Consumable(double cost) {
        super(cost, Type.CONSUMABLES);
    }
}
