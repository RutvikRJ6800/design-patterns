package singleton;

import singleton.doublecheckedsingleton.DoubleCheckedSingleton;
import singleton.eagersingleton.EagerSingleton;
import singleton.lazy.LazyInitialization;
import singleton.threadsafe.ThreadsafeSingleton;

public class SingletonPattern {
    public static void main(String[] args) {

        // Initialize the singleton objects
        Singleton eagerSingleton = EagerSingleton.getInstance();
        Singleton lazySingleton = LazyInitialization.getInstance();
        Singleton theradsafeSingleton = ThreadsafeSingleton.getInstance();
        Singleton doubleCheckedSingleton = DoubleCheckedSingleton.getInstance();

        /*
         call the business logic of the above class
         eg.
         eagerSingleton.doWork();
        */
    }
}
