package nfragiskatos.CreationalPatterns.Singleton.StaticBlockSingleton;

import java.io.File;
import java.io.IOException;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() throws IOException {
        System.out.println("Singleton is initializing");
        File.createTempFile(".", ".");
    }


    /*
    Makes sense, because even outside the scope of the Singleton patter we want to use static blocks when a class
    has static members that require complex initialization.
    The instance member is just like any other static member, but special in the case of this pattern.
     */
    static {
        try {
            instance = new StaticBlockSingleton();
        }
        catch (Exception e) {
            System.err.println("Failed to create singleton");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
