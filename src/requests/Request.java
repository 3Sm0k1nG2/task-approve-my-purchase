package requests;

import common.Type;
import interfaces.IRequest;

import java.util.UUID;

public class Request implements IRequest {
    private final UUID _id;
    private final Type _type;
    private final double _cost;

    public Request(double cost, Type type){
        _id = UUID.randomUUID();
        _cost = cost;
        _type = type;
    }

    public UUID getId(){
        return _id;
    }
    public Type getType(){
        return _type;
    }
    public double getCost(){
        return _cost;
    }
}
