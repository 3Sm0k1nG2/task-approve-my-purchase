package main.handlers;

import main.common.types.Employee;


/**
 * //TODO - Implement approval implementation for VicePresident level
 */
public class VicePresident extends Handler {
    public VicePresident() {
        super(Employee.VICE_PRESIDENT, new main.budgets.VicePresident());
    }
}
