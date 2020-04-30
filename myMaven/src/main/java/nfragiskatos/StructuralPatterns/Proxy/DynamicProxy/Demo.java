package nfragiskatos.StructuralPatterns.Proxy.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * Proxy which is constructed at runtime instead of compile time.
 */
public class Demo {

    @SuppressWarnings("unchecked")
    public static <T> T withLogging(T target, Class<T> itf) {
        return (T) Proxy.newProxyInstance(
                itf.getClassLoader(),
                new Class<?>[] {itf},
                new LoggingHandler(target)
        );
    }

    public static void main(String[] args) {
        Person person = new Person();
        Human logged = withLogging(person, Human.class);

        logged.talk();
        logged.walk();
        logged.walk();

        System.out.println(logged.toString());
    }
}
