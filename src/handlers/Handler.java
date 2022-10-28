package handlers;

import budgets.Budget;
import com.sun.jdi.InvalidTypeException;
import common.TypeFormatter;
import common.types.Employee;
import interfaces.IHandler;
import items.Item;
import common.Request;

public class Handler extends Approver implements IHandler {
    protected Employee type;
    protected Budget budget;

    public Handler(Employee type, Budget budget){
        super();
        this.type = type;
        this.budget = budget;
    }

    public Employee getType(){ return this.type; }

    @Override
    public void approve(Request request) {
        if (canApprove(request)) {
            System.out.println(TypeFormatter.toFormattedName(this.type) + " approved purchase with id " + request.getId() + " that costs " + request.getItem().getCost());
            return;
        }

        System.out.println("Purchase with id " + request.getId() + " needs approval from higher position than " + TypeFormatter.toFormattedName(this.type) + ".");
        next.approve(request);
    }

    @Override
    protected boolean canApprove(Request request){
        double budgetLimit;
        Item item = request.getItem();

        try{
            budgetLimit = this.budget.getLimit(item.getType());
        } catch (InvalidTypeException e){
            return false;
        }

        return item.getCost() < budgetLimit;
    }
}
