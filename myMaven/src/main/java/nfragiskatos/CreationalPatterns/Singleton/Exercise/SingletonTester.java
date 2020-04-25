package nfragiskatos.CreationalPatterns.Singleton.Exercise;

import java.util.function.Supplier;

public class SingletonTester {

    public static boolean isSingleton(Supplier<Object> func) {
        return func.get().equals(func.get());
    }
}
