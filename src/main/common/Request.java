package main.common;

import main.interfaces.IRequest;
import main.items.Item;

import java.util.UUID;

public class Request implements IRequest {
    private final UUID _id;
    private final Item _item;

    public Request(Item item){
        _id = UUID.randomUUID();
        _item = item;
    }

    public UUID getId(){
        return _id;
    }
    public Item getItem(){
        return _item;
    }
}
