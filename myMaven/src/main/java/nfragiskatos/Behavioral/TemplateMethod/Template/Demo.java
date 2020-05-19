package nfragiskatos.Behavioral.TemplateMethod.Template;

/**
 * Allows us to define the 'skeleton' of the algorithm, with concrete implementations defined in subclasses.
 *
 * Similar to strategy pattern but strategy does this through composition. High level algorithm uses an interface, and
 * concrete implementations implement the interface.
 *
 * Template method does the same thing through inheritance.
 *      Overall algorithm makes use of abstract member
 *      Inheritors override the abstract members
 *      Parent template method invoked
 */
public class Demo {
    public static void main(String[] args) {

        new Chess().run();
    }
}
