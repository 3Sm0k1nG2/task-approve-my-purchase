package main.handlers;

import main.common.types.Employee;

/**
 * //TODO - If needed, validate logic and if possible optimize code.
 */
public class Director extends Handler {
    public Director() {
        super(Employee.DIRECTOR, new main.budgets.Director());
    }
}
