package test;

import com.sun.jdi.InvalidTypeException;
import main.ApprovalChainGenerator;
import main.budgets.Budget;
import main.common.Request;
import main.common.types.Item;
import main.handlers.Approver;
import main.handlers.Manager;
import main.items.*;
import test.common.Response;

public final class RequestTest {

    private RequestTest(){
    }

    public static Response approverTest_belowAndEqualManagerApprover() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        Budget budget = new main.budgets.Manager();

        try{
            main.items.Item[] items = new  main.items.Item[]{
                    new Consumable(budget.getLimit(Item.CONSUMABLES)),
                    new Clerical(budget.getLimit(Item.CLERICAL)),
                    new Gadget(budget.getLimit(Item.GADGETS)),
                    new Gaming(budget.getLimit(Item.GAMING)),
                    new PC(budget.getLimit(Item.PC))
            };

            manager.approve(new Request(items[0]));
            manager.approve(new Request(items[1]));
            manager.approve(new Request(items[2]));
            manager.approve(new Request(items[3]));
            manager.approve(new Request(items[4]));

            return new Response(true, items);
        } catch (Exception e){
            return new Response(true, e);
        }
    }

    public static Response approverTest_aboveAllBudgetApprovers() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        Budget budget = new main.budgets.President();

        try{
            main.items.Item[] items = new  main.items.Item[]{
                    new Consumable(budget.getLimit(Item.CONSUMABLES)+0.1),
                    new Clerical(budget.getLimit(Item.CLERICAL)+0.1),
                    new Gadget(budget.getLimit(Item.GADGETS)+0.1),
                    new Gaming(budget.getLimit(Item.GAMING)+0.1),
                    new PC(budget.getLimit(Item.PC)+0.1)
            };

            manager.approve(new Request(items[0]));
            manager.approve(new Request(items[1]));
            manager.approve(new Request(items[2]));
            manager.approve(new Request(items[3]));
            manager.approve(new Request(items[4]));

            return new Response(true, items);
        } catch (Exception e){
            return new Response(true, e);
        }
    }

//    public Object directorHandler_aboveLimit() {
//        return new Object();
//    }
//
//    public Object givenHandler_underLimit() {
//        Approver manager = new Manager();
//        ApprovalChainGenerator.generate(manager);
//        //Be free to modify method below this line
//
//        // main.common.Request is abstract class
//        // TypeRequest(double cost) -> e.g. PCRequest, ConsumableRequest, ...
//        // id -> automatically assigned
//        // type -> automatically assigned from selected TypeRequest();
//
//        manager.approve(new Request(new Consumable(15000)));
//        manager.approve(new Request(new PC(5000)));
//        manager.approve(new Request(new PC(5000)));
//        manager.approve(new Request(new Clerical(3000)));
//
//        // manager.approve(1, 15000, Type.CONSUMABLES);
//        // manager.approve(2, 5000, Type.PC);
//        // manager.approve(3, 5000, Type.PC);
//        // manager.approve(4, 3000, Type.CLERICAL);
//    }
}
