package interfaces;

import common.types.Item;
import com.sun.jdi.InvalidTypeException;

public interface IBudget {
    double getLimit(Item itemType) throws InvalidTypeException;
}
