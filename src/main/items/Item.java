package main.items;

import main.interfaces.IItem;

public class Item implements IItem {

    private double _cost;
    private main.common.types.Item _type;

    public Item(double cost, main.common.types.Item type){
        _type = type;
        _cost = cost;
    }

    public main.common.types.Item getType() {
        return _type;
    }

    public double getCost() {
        return _cost;
    }
}
