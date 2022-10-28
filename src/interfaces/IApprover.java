package interfaces;

import handlers.Approver;
import common.Request;

public interface IApprover {
    void approve(Request request);
    Approver registerNext(Approver next);
}
