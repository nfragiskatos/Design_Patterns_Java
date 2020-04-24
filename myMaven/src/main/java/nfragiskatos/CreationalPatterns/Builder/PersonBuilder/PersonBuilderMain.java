package nfragiskatos.CreationalPatterns.Builder.PersonBuilder;

public class PersonBuilderMain {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person nick = pb.withName("Nick").build();

        EmployeeBuilder eb = new EmployeeBuilder();
        Person jack = eb.withName("Jack").worksAt("Dairy Queen").build();

        System.out.println(jack);
    }
}
