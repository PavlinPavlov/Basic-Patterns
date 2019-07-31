package factory.enums;

import factory.models.Crane;
import factory.models.Forklift;
import factory.models.Machine;
import factory.models.Truck;

public enum MethodEnum {

    CRANE {
        public Machine create() {
            return new Crane();
        }
    },
    FORKLIFT {
        public Machine create() {
            return new Forklift();
        }
    },
    TRUCK {
        public Machine create() {
            return new Truck();
        }
    };

    public Machine create() {
        return null;
    }
}
