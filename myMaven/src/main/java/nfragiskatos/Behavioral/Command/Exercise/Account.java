package nfragiskatos.Behavioral.Command.Exercise;

public class Account {
    public int balance = 0;

    public void process(Command c)
    {
        switch (c.action) {
            case DEPOSIT:
                balance += c.amount;
                c.success = true;
                break;
            case WITHDRAW:
                if (balance >= c.amount) {
                    balance -= c.amount;
                    c.success = true;
                } else {
                    c.success = false;
                }
                break;
        }
    }
}
