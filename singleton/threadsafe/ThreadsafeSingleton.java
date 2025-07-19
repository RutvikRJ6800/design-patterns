package singleton.threadsafe;

import singleton.Singleton;

public class ThreadsafeSingleton implements Singleton {
    public static ThreadsafeSingleton instance;

    private ThreadsafeSingleton() {}

    public static synchronized ThreadsafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadsafeSingleton();
        }
        return instance;
    }
 }
