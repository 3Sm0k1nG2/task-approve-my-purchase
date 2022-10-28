package interfaces;

import items.Item;

import java.util.UUID;

public interface IRequest {
    UUID getId();
    Item getItem();
}
