package nfragiskatos.Behavioral.ChainOfResponsibility.BrokerChain;

/**
 * Use Chain of Responsibility + observer pattern + mediator + memento
 */
public class Demo {
    public static void main(String[] args) {

        Game game = new Game();
        Creature goblin = new Creature(game, "Strong Goblin", 2, 2);

        System.out.println(goblin);

        IncreaseDefenseModifier idm = new IncreaseDefenseModifier(game, goblin);

        DoubleAttackModifier dam = new DoubleAttackModifier(game, goblin);
        try (dam) {
            System.out.println(goblin);
        }

        System.out.println(goblin);
    }
}
