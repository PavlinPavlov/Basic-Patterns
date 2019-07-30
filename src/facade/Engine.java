package facade;

public class Engine {
    private boolean isStarted;

    public void toggleEngine(boolean state) {
        this.isStarted = state;
    }

    public boolean isStarted() {
        return isStarted;
    }
}