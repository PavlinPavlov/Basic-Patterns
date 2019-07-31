package factory.models;

public class Crane implements Machine {
    @Override
    public void doWord() {
        System.out.println("Lift stuff very very high");
    }
}
