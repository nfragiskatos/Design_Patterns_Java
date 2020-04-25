package nfragiskatos.CreationalPatterns.Singleton.BasicSingleton;

import java.io.Serializable;

public class BasicSingleton implements Serializable {

    private int value = 0;
    private static final BasicSingleton INSTANCE = new BasicSingleton();

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private BasicSingleton() {
        
    }

    /*
    Just by implementing this method, it's a way to fix the issue with serialization breaking the singleton pattern.

    Allows a class to replace/resolve the object read from the stream before it is returned to the caller.
     */
    protected Object readResolve() {
        return INSTANCE;
    }

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }
}
