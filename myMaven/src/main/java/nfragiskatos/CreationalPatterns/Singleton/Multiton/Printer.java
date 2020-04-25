package nfragiskatos.CreationalPatterns.Singleton.Multiton;

/*
Another variation of the Singleton pattern.

Doesn't try to ensure there is a single instance, instead it tries to ensure that there are a finite number of instances.

Glorified key-value store with lazy loading.
 */

import java.util.HashMap;
import java.util.Map;

enum Subsystem {
    PRIMARY,
    AUXILIARY,
    FALLBACK
}

public class Printer {

    private static Map<Subsystem, Printer> instances = new HashMap<>();
    private static int instanceCount = 0;

    private Printer() {
        instanceCount++;
        System.out.println("A total of " + instanceCount + " instances created so far.");
    }

    public static Printer get(Subsystem ss) {
        if (instances.containsKey(ss)) {
            return instances.get(ss);
        } else {
            Printer instance = new Printer();
            instances.put(ss, instance);
            return instance;
        }
    }
}
