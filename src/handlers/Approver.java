package handlers;

import interfaces.IHandler;
import requests.Request;

public abstract class Approver implements IHandler {
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
