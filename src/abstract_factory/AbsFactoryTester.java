package abstract_factory;

import abstract_factory.models.Equipment;
import factory.models.Machine;

public class AbsFactoryTester {
    public static void main(String[] args) {
        AbstractFactory af = AbstractFactory.getFactory("equipment");

        Equipment box = (Equipment) af.getFromInventory(InventoryType.TOOLBOX);
        System.out.println(box);
    }
}
