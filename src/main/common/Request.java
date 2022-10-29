package main.common;

import main.interfaces.IRequest;
import main.items.Item;

import java.util.UUID;

public class Request implements IRequest {
    private final UUID id;
    private final Item item;

    public Request(Item item){
        this.id = UUID.randomUUID();
        this.item = item;
    }

    public UUID getId(){
        return this.id;
    }
    public Item getItem(){
        return this.item;
    }
}
