package main;

import main.handlers.Approver;
import main.handlers.Manager;
import main.items.*;
import main.common.Request;

/**
 * Execution class of the application.
 * Be free to modify below line 14 (bellow comment line)
 */
public class PurchaseApprovalExecutor {

    public static void execute() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        //Be free to modify method below this line

        // main.common.Request is abstract class
        // TypeRequest(double cost) -> e.g. PCRequest, ConsumableRequest, ...
        // id -> automatically assigned
        // type -> automatically assigned from selected TypeRequest();

        manager.approve(new Request(new Consumable(15000)));
        manager.approve(new Request(new PC(5000)));
        manager.approve(new Request(new PC(5000)));
        manager.approve(new Request(new Clerical(3000)));

        // manager.approve(1, 15000, Type.CONSUMABLES);
        // manager.approve(2, 5000, Type.PC);
        // manager.approve(3, 5000, Type.PC);
        // manager.approve(4, 3000, Type.CLERICAL);
    }
}
