package abstract_factory;

public abstract class AbstractFactory<T> {

    public static AbstractFactory getFactory(String type) {
        switch (type.toUpperCase()) {
            case "MACHINE":
                return new MachineFactory();
            case "EQUIPMENT":
                return new EquipmentFactory();
            default:
                throw new RuntimeException("Wrong type");
        }
    }

    public abstract T getFromInventory(InventoryType tEnum);
}
