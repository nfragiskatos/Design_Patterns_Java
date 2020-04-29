package nfragiskatos.StructuralPatterns.Decorator.StringDecorator;


public class Demo {
    public static void main(String[] args) {

        MagicString s = new MagicString("Hello");
        System.out.println(s + " has " + s.getNumberOfVowels() + " vowels.");
    }
}
