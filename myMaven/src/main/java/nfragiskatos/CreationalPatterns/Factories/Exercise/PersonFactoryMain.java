package nfragiskatos.CreationalPatterns.Factories.Exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PersonFactoryMain {
    public static void main(String[] args) {
        PersonFactory pf = new PersonFactory();

        bldMockData().stream().map(n -> pf.createPerson(n)).forEach(PersonFactoryMain::printPerson);
    }

    private static Collection<String> bldMockData() {
        List<String> names = new ArrayList<>();
        names.add("Jake");
        names.add("Jack");
        names.add("John");
        names.add("Joseph");
        names.add("Jason");
        names.add("Jill");
        names.add("JoJo");
        names.add("James");
        return names;
    }

    private static void printPerson(Person person) {
        System.out.println(String.format("%s - %s", person.id, person.name));
    }
}
