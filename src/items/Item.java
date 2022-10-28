package items;

import interfaces.IItem;

public class Item implements IItem {

    private double _cost;
    private common.types.Item _type;

    public Item(double cost, common.types.Item type){
        _type = type;
        _cost = cost;
    }

    public common.types.Item getType() {
        return _type;
    }

    public double getCost() {
        return _cost;
    }
}
