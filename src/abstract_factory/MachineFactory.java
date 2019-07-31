package abstract_factory;


import factory.models.Crane;
import factory.models.Forklift;
import factory.models.Machine;
import factory.models.Truck;

import java.util.HashMap;
import java.util.Map;

import static abstract_factory.InventoryType.*;

public class MachineFactory extends AbstractFactory<Machine> {

    private static Map<InventoryType, Machine> machines = new HashMap<InventoryType, Machine>() {
        {
            put(CRANE,  new Crane());
            put(FORKLIFT,  new Forklift());
            put(TRUCK,  new Truck());
        }
    };

    @Override
    public Machine getFromInventory(InventoryType tEnum) {
        if (!machines.containsKey(tEnum))
            throw new RuntimeException("Unrecognized type;");
        return machines.get(tEnum);
    }
}
