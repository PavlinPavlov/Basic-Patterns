package facade;

public class Car implements AutoStartable{
    private Driver driver;
    private Engine engine;
    private boolean isClutchPressed;
    private int gear;

    Car(Driver driver) {
        this.driver = driver;
        this.engine = new Engine();
    }

    @Override
    public boolean driveOff() {
        this.engine.toggleEngine(true);
        this.driver.toggleSeatBelt(true);
        this.isClutchPressed = true;
        this.gear = 1;
        return drive();
    }

    boolean drive() {
        if (driver == null)
            return false;

        if (!engine.isStarted())
            throw new CarDriveException("Engine not started");

        if (gear != 1) {
            System.out.println("GRGHGRRRRR");
            this.engine.toggleEngine(false);
            throw new CarDriveException("Wrong gear");
        }

        if (!driver.isSeatBeltPut()) {
            while (true)
                System.out.println("beeb");
        }

        return true;
    }

    void pressClutch() {
        isClutchPressed = true;
    }

    void startEngine() {
        this.engine.toggleEngine(true);
    }

    void putIntoGear(int gear) {
        if (!isClutchPressed) {
            System.out.println("GRGHGRRRRR");
            this.engine.toggleEngine(false);
            throw new CarDriveException("Press the clutch first");
        }

        this.gear = gear;
    }

    public Driver getDriver() {
        return driver;
    }
}