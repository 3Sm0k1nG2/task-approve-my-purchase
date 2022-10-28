package handlers;

import interfaces.IApprover;
import common.Request;

public abstract class Approver implements IApprover {
    protected Approver next;

    /**
     * If needed, be free to change signature of abstract methods.
     */
    public abstract void approve(Request request);
    protected abstract boolean canApprove(Request request);

    /**
     * Method used for registering next approver level.
     * DO NOT CHANGE IT.
     */
    public Approver registerNext(Approver next) {
        this.next = next;
        return next;
    }
}
