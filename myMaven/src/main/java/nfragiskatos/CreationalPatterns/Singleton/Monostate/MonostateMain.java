package nfragiskatos.CreationalPatterns.Singleton.Monostate;

public class MonostateMain {
    public static void main(String[] args) {
        ChiefExecutiveOfficer ceo1 = new ChiefExecutiveOfficer();
        ceo1.setName("Adam Smith");
        ceo1.setAge(55);

        // ceo2 will already be initialized with the previously set values.
        // Confusing and potentially dangerous
        ChiefExecutiveOfficer ceo2 = new ChiefExecutiveOfficer();
        System.out.println(ceo2);
    }
}
