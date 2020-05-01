package nfragiskatos.Behavioral.ChainOfResponsibility.MethodChain;

/**
 * This pattern is a chain of components who all get a chance to process a command or a query, optionally having
 * default processing implementation and an ability to terminate the processing chain.
 */

public class Demo {
    public static void main(String[] args) {
        Creature goblin = new Creature("Goblin", 2, 2);
        System.out.println(goblin);

        CreatureModifier root = new CreatureModifier(goblin);

        /**
         * Cut the chain of responsibility here.
         */
        root.add(new NoBonusesModifier(goblin));

        System.out.println("Let's double goblin's attack...");
        root.add(new DoubleAttackModifier(goblin));

        System.out.println("Let's increase goblin's defense...");
        root.add(new IncreaseDefenseModifier(goblin));

        root.handle();
        System.out.println(goblin);
    }
}
