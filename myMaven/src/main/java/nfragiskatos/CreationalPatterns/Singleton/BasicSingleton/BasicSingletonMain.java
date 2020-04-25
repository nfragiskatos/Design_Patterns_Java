package nfragiskatos.CreationalPatterns.Singleton.BasicSingleton;

public class BasicSingletonMain {

    public static void main(String[] args) {

        BasicSingleton singleton = BasicSingleton.getInstance();

        singleton.setValue(123);
        System.out.println(singleton.getValue());
    }
}
