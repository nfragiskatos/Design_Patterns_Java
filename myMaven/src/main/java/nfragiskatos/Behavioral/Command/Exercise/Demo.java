package nfragiskatos.Behavioral.Command.Exercise;

public class Demo {
    public static void main(String[] args) {

        Account a = new Account();

        Command command = new Command(Command.Action.DEPOSIT, 100);
        a.process(command);

        System.out.println(a.balance);

        command = new Command(Command.Action.WITHDRAW, 50);
        a.process(command);

        System.out.println(a.balance);

        command = new Command(Command.Action.WITHDRAW, 150);
        a.process(command);

        System.out.println(a.balance);

    }
}
