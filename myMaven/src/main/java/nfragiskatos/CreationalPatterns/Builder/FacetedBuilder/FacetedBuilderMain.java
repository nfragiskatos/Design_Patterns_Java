package nfragiskatos.CreationalPatterns.Builder.FacetedBuilder;

public class FacetedBuilderMain {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person person = pb
                .lives()
                    .at("123 London rd")
                    .in("London")
                    .withPostcode("54321")
                .works()
                    .at("Dairy Queen")
                    .asA("Cook")
                    .earning(1230000)
                .build();

        System.out.println(person);

    }
}
