package abstract_factory;

import abstract_factory.models.Equipment;
import abstract_factory.models.Radar;
import abstract_factory.models.ToolBox;

import java.util.HashMap;
import java.util.Map;

import static abstract_factory.InventoryType.RADAR;
import static abstract_factory.InventoryType.TOOLBOX;

public class EquipmentFactory extends AbstractFactory<Equipment> {

    private static Map<InventoryType, Equipment> equipment = new HashMap<InventoryType, Equipment>() {
        {
            put(RADAR,  new Radar());
            put(TOOLBOX,  new ToolBox());
        }
    };

    @Override
    public Equipment getFromInventory(InventoryType tEnum) {
        if (!equipment.containsKey(tEnum))
            throw new RuntimeException("Unrecognized type;");
        return equipment.get(tEnum);
    }
}
