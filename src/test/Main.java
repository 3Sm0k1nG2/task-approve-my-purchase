package test;

import main.ApprovalChainGenerator;
import main.PurchaseApprovalExecutor;
import main.handlers.Approver;
import main.handlers.Manager;
import test.common.Response;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\tTEST: approverTest_belowAndEqualManagerApprover");
        Response res = RequestTest.approverTest_belowAndEqualManagerApprover();
        System.out.println("\tSTATUS: " + (res.getStatus() ? "succesful" : "failed\n\tERROR: " + res.getError()));


        System.out.println("\n\tTEST: approverTest_aboveAllBudgetApprovers");
        res = RequestTest.approverTest_aboveAllBudgetApprovers();
        System.out.println("\tSTATUS: " + (res.getStatus() ? "succesful" : "failed\n\tERROR: " + res.getError()));
    }

}