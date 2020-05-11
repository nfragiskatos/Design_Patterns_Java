package nfragiskatos.Behavioral.NullObject.Dynamic;

import nfragiskatos.Behavioral.NullObject.Basic.BankAccount;
import nfragiskatos.Behavioral.NullObject.Basic.Log;

import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;

/**
 * Instead of creating a null object for each dependency, which would be tedious, we could create dynamically at runtime.
 *
 * This will also utilize the Proxy pattern.
 */
public class Demo {

    @SuppressWarnings("unchecked")
    public static <T> T noOp(Class<T> itf) {
        return (T) Proxy.newProxyInstance(
                itf.getClassLoader(),
                new Class<?>[]{itf},
                (proxy, method, args) ->
                {
                    if (method.getReturnType().equals(Void.TYPE))
                        return null;
                    else
                        return method.getReturnType().getConstructor().newInstance();
                });
    }

    public static void main(String[] args) {

        Log log = noOp(Log.class);
        BankAccount ba = new BankAccount(log);

        // No output now.
        ba.deposit(100);
    }
}
