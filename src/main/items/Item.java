package main.items;

import main.interfaces.IItem;

public class Item implements IItem {

    private double cost;
    private main.common.types.Item type;

    public Item(double cost, main.common.types.Item type){
        this.type = type;
        this.cost = cost;
    }

    public main.common.types.Item getType() {
        return this.type;
    }

    public double getCost() {
        return this.cost;
    }
}
