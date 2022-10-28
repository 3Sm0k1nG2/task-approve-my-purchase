package main.handlers;

import main.common.Request;

/**
 * Used as a fallback in approval chain.
 * Should not contain any additional logic.
 * If abstract methods are changed, be free to edit signatures.
 */
public class ExecutiveMeeting extends Handler {
    private static final ExecutiveMeeting INSTANCE = new ExecutiveMeeting();

    public ExecutiveMeeting() {
        super(null, null);
    }

    public static ExecutiveMeeting getInstance() {
        return INSTANCE;
    }

    @Override
    public void approve(Request request) {
        System.out.println("Purchase with id " + request.getId() + " that costs " + request.getItem().getCost() + " requires an approval of executive meeting.");
    }

    @Override
    protected boolean canApprove(Request request) {
        return false;
    }
}
