package nfragiskatos.CreationalPatterns.Factories.AbstractFactory;

import javafx.util.Pair;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HotDrinkMachine {
    private List<Pair<String, HotDrinkFactory>> namedFactories = new ArrayList<>();

    public HotDrinkMachine() throws Exception {
        Reflections reflections = new Reflections("");
        Set<Class<? extends HotDrinkFactory>> clazzes = new Reflections("").getSubTypesOf(HotDrinkFactory.class);

        for (Class<? extends HotDrinkFactory> clazz : clazzes) {
            namedFactories.add(new Pair<String, HotDrinkFactory>(
                    clazz.getSimpleName().replace("Factory", ""),
                    clazz.getDeclaredConstructor().newInstance()
            ));
        }
    }

    public HotDrink makeDrink() throws Exception {
        System.out.println("Available drink:");
        for (int i = 0; i < namedFactories.size(); ++i) {
            System.out.println(i + ". " + namedFactories.get(i).getKey());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s;
            int i, amount;
            if ((s = reader.readLine()) != null
                && (i = Integer.parseInt(s)) >=0
                && (i < namedFactories.size())) {
                System.out.println("Specify amount: ");
                s = reader.readLine();
                if (s != null && (amount = Integer.parseInt(s)) > 0) {
                    return namedFactories.get(i).getValue().prepare(amount);
                }
            }
            System.out.println("Incorrect input, try again");
        }
    }
}
