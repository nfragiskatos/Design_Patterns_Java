package nfragiskatos.CreationalPatterns.Factories.AbstractFactory;

public class TeaFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Put in the tea bag, boil water, pour " + amount + "ml, add lemon, enjoy!");
        return new Tea();
    }
}
