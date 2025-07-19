package singleton.doublecheckedsingleton;

import singleton.Singleton;

public class DoubleCheckedSingleton implements Singleton {
    public static volatile DoubleCheckedSingleton instace;

    private DoubleCheckedSingleton() {}

    public static DoubleCheckedSingleton getInstance() {
        if(instace == null) {
            synchronized (DoubleCheckedSingleton.class) {
                instace = new DoubleCheckedSingleton();
            }
        }

        return instace;
    }
 }
