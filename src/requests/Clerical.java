package requests;

import common.Type;

public class Clerical extends Request{
    public Clerical(double cost) {
        super(cost, Type.CLERICAL);
    }
}
