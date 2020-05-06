package nfragiskatos.Behavioral.Iterator.ArrayBacked;

public class Demo {
    public static void main(String[] args) {

        Creature creature = new Creature();

        creature.setAgility(12);
        creature.setIntelligence(13);
        creature.setStrength(17);

        System.out.println(
                "Creature has a max stat of " + creature.max()
                + ", total stats = " + creature.sum()
                + ", avg stat = " + creature.average()
        );
    }
}
