
package facade;

public class Driver {
    private boolean seatBeltPut;

    public void toggleSeatBelt(boolean state) {
        this.seatBeltPut = state;
    }

    public boolean isSeatBeltPut() {
        return seatBeltPut;
    }
}