package singleton.eagersingleton;

import singleton.Singleton;

public class EagerSingleton implements Singleton {
    public static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }
}
