package singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static final long serialVersionUID = 123456L;
    private static volatile Singleton instance;

    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance(), not reflection!");
        }

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    protected Singleton readResolve() {
        return getInstance();
    }
}
