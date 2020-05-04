package nfragiskatos.Behavioral.Command.Command;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * An object which represents an instruction to perform a particular action. Contains all the
 * information necessary for the action to be taken.
 */
public class Demo {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        System.out.println(ba);

        List<BankAccountCommand> commands = new ArrayList<BankAccountCommand>();
        commands.add(new BankAccountCommand(ba, BankAccountCommand.Action.DEPOSIT, 100));
        commands.add(new BankAccountCommand(ba, BankAccountCommand.Action.WITHDRAW, 1000));


        Collections.reverse(commands);
        for (BankAccountCommand c : commands) {
            c.call();
            System.out.println(ba);
        }

    }
}
