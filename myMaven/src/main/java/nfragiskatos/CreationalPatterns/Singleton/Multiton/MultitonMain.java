package nfragiskatos.CreationalPatterns.Singleton.Multiton;

public class MultitonMain {
    public static void main(String[] args) {
        Printer main = Printer.get(Subsystem.PRIMARY);
        Printer auxiliary = Printer.get(Subsystem.AUXILIARY);
        Printer auxiliary2 = Printer.get(Subsystem.AUXILIARY);
    }
}
