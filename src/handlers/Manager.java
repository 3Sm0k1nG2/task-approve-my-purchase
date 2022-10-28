package handlers;

import budgets.Budget;
import com.sun.jdi.InvalidTypeException;
import requests.Request;

/**
 * //TODO - If needed, validate logic and if possible optimize code
 */
public class Manager extends Approver {
    protected Budget budget;

    public Manager(){
        super();
        this.budget = new budgets.Manager();
    }

    @Override
    public void approve(Request request) {
        if (canApprove(request)) {
            System.out.println("Manager approved purchase with id " + request.getId() + " that costs " + request.getCost());
            return;
        }

        System.out.println("Purchase with id " + request.getId() + " needs approval from higher position than Manager.");
        next.approve(request);
    }

    @Override
    protected boolean canApprove(Request request){
        try{
            return request.getCost() <= this.budget.getLimit(request.getType());
        } catch (InvalidTypeException e) {
            return false;
        }
    }
}
