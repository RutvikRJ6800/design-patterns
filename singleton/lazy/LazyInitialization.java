package singleton.lazy;

import singleton.Singleton;

public class LazyInitialization implements Singleton {
    public static LazyInitialization instance;

    private LazyInitialization() {}

    public static LazyInitialization getInstance() {
        if (instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }
}
