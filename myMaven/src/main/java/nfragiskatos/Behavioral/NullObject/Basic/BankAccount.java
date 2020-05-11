package nfragiskatos.Behavioral.NullObject.Basic;

public class BankAccount {

    private Log log;
    private int balance = 0;
    public BankAccount(Log log) {
        this.log = log;
    }

    public void deposit(int amount) {
        balance += amount;
        log.info("Deposited $" + amount);
    }
}
