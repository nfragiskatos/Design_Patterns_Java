package nfragiskatos.Behavioral.ChainOfResponsibility.BrokerChain;

public class CreatureModifier {
    protected Game game;
    protected Creature creature;

    public CreatureModifier(Game game, Creature creature) {
        this.game = game;
        this.creature = creature;
    }
}
