package nfragiskatos.CreationalPatterns.Singleton.LazySingleton;

/*
Lazy initialization is a problem with singletons

Sometimes you only want the singleton to be initialized only when someone calls getInstance, and you don't want it
initialized in a static block or static context. Only made when someone needs it.

Potential race conditions if not protected against
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("Initializing LazySingleton");
    }

    /*
    Thread safety solution: synchronized method.

    Performance implications
     */
//    public static synchronized LazySingleton getInstance() {
//        if (instance == null) {
//            instance = new LazySingleton();
//        }
//        return instance;
//    }

    /*
    Another method: Double-check locking

    Outdated approach though.
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
