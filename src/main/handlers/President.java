package main.handlers;

import main.common.types.Employee;

/**
 * //TODO - Implement approval implementation for President level
 */
public class President extends Handler {
    public President() {
        super(Employee.PRESIDENT, new main.budgets.President());
    }
}
