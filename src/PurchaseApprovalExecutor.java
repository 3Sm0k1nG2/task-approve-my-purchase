import handlers.Approver;
import handlers.Manager;
import requests.*;

/**
 * Execution class of the application.
 * Be free to modify below line 14 (bellow comment line)
 */
public class PurchaseApprovalExecutor {

    public static void execute() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        //Be free to modify method below this line

        // common.Request is abstract class
        // TypeRequest(double cost) -> e.g. PCRequest, ConsumableRequest, ...
        // id -> automatically assigned
        // type -> automatically assigned from selected TypeRequest();

        manager.approve(new Consumable(15000));
        manager.approve(new PC(5000));
        manager.approve(new PC(5000));
        manager.approve(new Clerical(3000));

        // manager.approve(1, 15000, Type.CONSUMABLES);
        // manager.approve(2, 5000, Type.PC);
        // manager.approve(3, 5000, Type.PC);
        // manager.approve(4, 3000, Type.CLERICAL);
    }
}
