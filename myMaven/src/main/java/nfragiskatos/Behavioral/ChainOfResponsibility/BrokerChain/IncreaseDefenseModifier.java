package nfragiskatos.Behavioral.ChainOfResponsibility.BrokerChain;

public class IncreaseDefenseModifier extends  CreatureModifier{

    public final int token;

    public IncreaseDefenseModifier(Game game, Creature creature) {
        super(game, creature);
        token = game.queries.subscribe(q -> {
            if (q.creatureName.equals(creature.name) && q.argument == Query.Argument.DEFENSE) {
                q.result +=3;
            }
        });
    }
}
