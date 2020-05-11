package nfragiskatos.Behavioral.NullObject.Basic;

/**
 * When a component A uses component B, it typically assumes that B is non-null. And typically with DI, you inject
 * something that's not null.
 *
 * A no-op object that conforms to the required interface satisfying a dependency requirement of some other object.
 */
public class Demo {
    public static void main(String[] args) {

        ConsoleLog log = new ConsoleLog();
        BankAccount ba = new BankAccount(log);

        ba.deposit(100);

        NullLog nullLog = new NullLog();
        BankAccount ba2 = new BankAccount(nullLog);
        // Now deposits without printing anything.
        ba.deposit(500);
    }
}
