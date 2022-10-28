package requests;

import common.Type;

public class Gadget extends Request{
    public Gadget(double cost) {
        super(cost, Type.GADGETS);
    }
}
