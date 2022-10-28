package items;

import common.Type;
import interfaces.IItem;

public class Item implements IItem {

    private double _cost;
    private Type _type;

    public Item(double cost, Type type){
        _type = type;
        _cost = cost;
    }

    public Type getType() {
        return _type;
    }

    public double getCost() {
        return _cost;
    }
}
