package main.handlers;

import main.common.types.Employee;

/**
 * //TODO - If needed, validate logic and if possible optimize code
 */
public class Manager extends Handler {
    public Manager() {
        super(Employee.MANAGER, new main.budgets.Manager());
    }
}
