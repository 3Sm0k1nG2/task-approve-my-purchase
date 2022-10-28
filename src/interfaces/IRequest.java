package interfaces;

import common.Type;
import items.Item;

import java.util.UUID;

public interface IRequest {
    UUID getId();
    Type getType();
    double getCost();
}
