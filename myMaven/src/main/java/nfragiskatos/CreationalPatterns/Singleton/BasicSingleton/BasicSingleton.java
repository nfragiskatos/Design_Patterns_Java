package nfragiskatos.CreationalPatterns.Singleton.BasicSingleton;

public class BasicSingleton {

    private int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private BasicSingleton() {
        
    }

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }
}
