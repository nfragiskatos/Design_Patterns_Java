package nfragiskatos.Behavioral.ChainOfResponsibility.MethodChain;

public class NoBonusesModifier  extends CreatureModifier{

    public NoBonusesModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        // do nothing
        System.out.println("No bonuses for you");
    }
}
