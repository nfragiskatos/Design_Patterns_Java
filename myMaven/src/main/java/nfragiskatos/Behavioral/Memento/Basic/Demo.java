package nfragiskatos.Behavioral.Memento.Basic;

/**
 * Keep a memento of an object's state to return to that state.
 *
 * A token/handle representing the system state. Lets us roll back to the state when the token was generated.
 * May or may not directly expose state information.
 */
public class Demo {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount(100);

        Memento m1 = ba.deposit(50);
        Memento m2 = ba.deposit(25);

        System.out.println(ba);

        ba.restore(m1);
        System.out.println(ba);

        ba.restore(m2);
        System.out.println(ba);
    }
}
