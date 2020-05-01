package nfragiskatos.Behavioral.ChainOfResponsibility.MethodChain;

public class IncreaseDefenseModifier  extends CreatureModifier{

    public IncreaseDefenseModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("Increasing " + creature.name + "'s defense");
        creature.defense += 3;
        super.handle();
    }
}
