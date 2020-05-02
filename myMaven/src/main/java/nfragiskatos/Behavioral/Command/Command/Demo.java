package nfragiskatos.Behavioral.Command.Command;

import java.util.List;

/**
 * An object which represents an instruction to perform a particular action. Contains all the
 * information necessary for the action to be taken.
 */
public class Demo {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        System.out.println(ba);

        List<BankAccountCommand> commands = List.of(new BankAccountCommand(ba, BankAccountCommand.Action.DEPOSIT, 100),
                new BankAccountCommand(ba, BankAccountCommand.Action.WITHDRAW, 1000));

        for (BankAccountCommand c : commands) {
            c.call();
            System.out.println(ba);
        }
    }
}
