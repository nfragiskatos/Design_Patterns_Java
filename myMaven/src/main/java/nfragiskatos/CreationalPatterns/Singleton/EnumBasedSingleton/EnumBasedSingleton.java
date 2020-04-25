package nfragiskatos.CreationalPatterns.Singleton.EnumBasedSingleton;

/*
Nice trick. Enums are singletons by definition. Some problems though:

1. Are serializable by default, but it's not the kind of serialization that lets you preserve the state of the singleton
    - When you serialize enums, fields are not serialized. The only thing that's serialized is the name of the instance.
2. No inheritance
 */
public enum EnumBasedSingleton {
    INSTANCE;

    EnumBasedSingleton() {
        value = 42;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
