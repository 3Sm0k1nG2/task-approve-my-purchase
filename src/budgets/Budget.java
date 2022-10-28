package budgets;

import common.types.Item;
import interfaces.IBudget;
import items.*;
import com.sun.jdi.InvalidTypeException;

public class Budget implements IBudget {
    private items.Item[] budgets;

    public Budget(
            double consumable,
            double clerical,
            double gadget,
            double gaming,
            double pc
    ){
        this.budgets = new items.Item[]{
                new Consumable(consumable),
                new Clerical(clerical),
                new Gadget(gadget),
                new Gaming(gaming),
                new PC(pc)
        };
    }

    public double getLimit(Item itemType) throws InvalidTypeException{
         for (items.Item item : this.budgets) {
             if(item.getType() == itemType) {
                 return item.getCost();
             }
         }

         throw new InvalidTypeException("Invalid type or not found. Typed received: " + itemType.name());
    }
}
