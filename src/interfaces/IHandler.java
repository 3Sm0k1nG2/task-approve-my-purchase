package interfaces;

import handlers.Approver;
import requests.Request;

public interface IHandler {
    void approve(Request request);
    Approver registerNext(Approver next);
}
