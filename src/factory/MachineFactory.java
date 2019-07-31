package factory;

import factory.enums.MapEnum;
import factory.enums.MethodEnum;
import factory.enums.ReflectionEnum;
import factory.models.Crane;
import factory.models.Forklift;
import factory.models.Machine;
import factory.models.Truck;

import java.util.HashMap;
import java.util.Map;

import static factory.enums.MapEnum.*;

class MachineFactory {

    private static Map<MapEnum, Machine> machines = new HashMap<MapEnum, Machine>() {
        {
            put(CRANE,  new Crane());
            put(FORKLIFT,  new Forklift());
            put(TRUCK,  new Truck());
        }
    };

    static Machine getMachine(MapEnum mEnum) {
        return machines.get(mEnum);
    }

    static Machine getMachine(ReflectionEnum rEnum) {
        String name = rEnum.getKey();
        try {
            return (Machine) Class.forName(name).newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            throw new RuntimeException("Class not found");
        }
    }

    static Machine getMachine(MethodEnum mEnum) {
        return mEnum.create();
    }
}
