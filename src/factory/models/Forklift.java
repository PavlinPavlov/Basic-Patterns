package factory.models;

public class Forklift implements Machine {
    @Override
    public void doWord() {
        System.out.println("Lift some stuff");
    }
}
