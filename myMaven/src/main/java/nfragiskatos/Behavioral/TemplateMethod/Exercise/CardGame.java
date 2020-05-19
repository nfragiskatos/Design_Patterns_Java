package nfragiskatos.Behavioral.TemplateMethod.Exercise;

public abstract class CardGame {
    public Creature[] creatures;

    public CardGame(Creature[] creatures) {
        this.creatures = creatures;
    }

    public int combat(int creature1, int creature2) {
        Creature first = creatures[creature1];
        Creature second = creatures[creature2];
        hit(first, second);
        hit(second, first);

        if ((first.health <= 0 && second.health <= 0) || (first.health > 0 && second.health > 0)) {
            return -1;
        } else if (first.health > 0) {
            return creature1;
        } else {
            return creature2;
        }
    }

    protected abstract void hit(Creature attacker, Creature other);
}
