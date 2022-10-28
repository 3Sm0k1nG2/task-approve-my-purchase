package interfaces;

import common.Type;
import com.sun.jdi.InvalidTypeException;

public interface IBudget {
    double getLimit(Type type) throws InvalidTypeException;
}
