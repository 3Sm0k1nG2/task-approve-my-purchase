package main.interfaces;

import main.handlers.Approver;
import main.common.Request;

public interface IApprover {
    void approve(Request request);
    Approver registerNext(Approver next);
}
