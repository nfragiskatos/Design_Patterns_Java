package nfragiskatos.StructuralPatterns.Flyweight.RepeatingUserNames;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Saving memory by not storing duplicate names for different users that share a common name (first or last)
 */
public class User {

    static List<String> strings = new ArrayList<>();

    private int[] names;

    public User(String fullName) {
        Function<String, Integer> getOrAdd = (String s) -> {
            int index = strings.indexOf(s);
            if (index != -1) {
                return index;
            } else {
                strings.add(s);
                return strings.size() - 1;
            }
        };
        names = Arrays.stream(fullName.split(" ")).mapToInt(s -> getOrAdd.apply(s)).toArray();
    }
}
