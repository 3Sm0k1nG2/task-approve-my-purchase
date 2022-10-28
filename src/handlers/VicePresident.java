package handlers;

import common.types.Employee;


/**
 * //TODO - Implement approval implementation for VicePresident level
 */
public class VicePresident extends Handler {
    public VicePresident() {
        super(Employee.VICE_PRESIDENT, new budgets.VicePresident());
    }
}
