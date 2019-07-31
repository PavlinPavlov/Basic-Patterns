package factory.models;

public class Truck implements Machine {
    @Override
    public void doWord() {
        System.out.println("Drive stuff away");
    }
}
