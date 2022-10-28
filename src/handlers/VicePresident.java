package handlers;

import budgets.Budget;
import com.sun.jdi.InvalidTypeException;
import requests.Request;


/**
 * //TODO - Implement approval implementation for VicePresident level
 */
public class VicePresident extends Approver {
    protected Budget budget;

    public VicePresident(){
        super();
        this.budget = new budgets.VicePresident();
    }

    @Override
    public void approve(Request request) {
        if (canApprove(request)) {
            System.out.println("Vice President approved purchase with id " + request.getId() + " that costs " + request.getCost());
            return;
        }

        System.out.println("Purchase with id " + request.getId() + " needs approval from higher position than Vice President.");
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
