package nfragiskatos.StructuralPatterns.Decorator.Exercise;

public class Bird {

    public int age;

    public String fly() {
        return age < 10 ? "flying": "too odl";
    }
}
