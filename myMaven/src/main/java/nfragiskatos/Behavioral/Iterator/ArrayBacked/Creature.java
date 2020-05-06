package nfragiskatos.Behavioral.Iterator.ArrayBacked;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Creature implements Iterable<Integer>{

    private int[] stats = new int[3];
    private final int str = 0;
    private final int agi = 1;
    private final int intel = 2;

    public int getStrength() {
        return  stats[str];
    }

    public void setStrength(int val) {
        stats[str] = val;
    }

    public int getAgility() {
        return stats[agi];
    }

    public void setAgility(int val) {
        stats[agi] = val;
    }

    public int getIntelligence() {
        return stats[intel];
    }

    public void setIntelligence(int val) {
        stats[intel] = val;
    }

    public int sum() {
        return IntStream.of(stats).sum();
    }

    public int max(){
        return IntStream.of(stats).max().getAsInt();
    }

    public double average() {
        return IntStream.of(stats).average().getAsDouble();
    }

    @Override
    public Iterator<Integer> iterator() {
        return IntStream.of(stats).iterator();
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {

        for (int x : stats) {
            action.accept(x);
        }
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return IntStream.of(stats).spliterator();
    }
}
