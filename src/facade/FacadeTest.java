package facade;

public class FacadeTest {
    public static void main(String[] args) {
        AutoStartable car = new Car(new Driver());

//        stuff needed to drive off
//        car.startEngine();
//        car.getDriver().toggleSeatBelt(true);
//        car.pressClutch();
//        car.putIntoGear(1);
//        System.out.println(car.drive());

        System.out.println(car.driveOff());
    }
}