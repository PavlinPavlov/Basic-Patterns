package factory;

import factory.enums.MapEnum;
import factory.enums.MethodEnum;
import factory.enums.ReflectionEnum;
import factory.models.Machine;

public class FactoryMethodTester {
    public static void main(String[] args) {
        Machine truck = MachineFactory.getMachine(MapEnum.TRUCK);
        Machine forklift = MachineFactory.getMachine(MethodEnum.FORKLIFT);
        Machine crane = MachineFactory.getMachine(ReflectionEnum.CRANE);

        truck.doWord();
        forklift.doWord();
        crane.doWord();
    }
}
