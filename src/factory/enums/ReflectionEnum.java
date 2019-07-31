package factory.enums;

public enum ReflectionEnum {
    CRANE("factory.models.Crane"),
    FORKLIFT("factory.models.Forklift"),
    TRUCK("factory.models.Truck");

    private final String key;

    ReflectionEnum(String key) {
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }
}
