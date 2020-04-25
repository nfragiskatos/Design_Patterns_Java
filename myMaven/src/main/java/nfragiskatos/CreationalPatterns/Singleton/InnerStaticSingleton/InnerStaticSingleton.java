package nfragiskatos.CreationalPatterns.Singleton.InnerStaticSingleton;

/*
This is the initialization-on-demand holder idiom. This protects against thread safety for lazy initialization

Java classes do not automatically initialize inner classes. So the inner class on gets initialized by getInstance.

Class initialization is guaranteed to be sequential in Java so the JVM implicitly renders it thread-safe.
 */
public class InnerStaticSingleton {
    private InnerStaticSingleton() {
    }

    private static class Impl {
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    public InnerStaticSingleton getInstance() {
        return Impl.INSTANCE;
    }
}
