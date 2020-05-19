package nfragiskatos.Behavioral.Visitor.IntrusiveVisitor;

/**
 * Allows adding extra behavior to entire hierarchies of classes.
 *
 * A pattern where a component (visitor) is allowed to traverse the entire inheritance hierarchy. Implemented by
 * propagating a single visit() method throughout the entire hierarchy
 */
public class Demo {
    public static void main(String[] args) {
        // 1 + (2+3)
        AdditionExpression e = new AdditionExpression(
                new DoubleExpression(1),
                new AdditionExpression(
                        new DoubleExpression(2),
                        new DoubleExpression(3))
        );

        StringBuilder sb = new StringBuilder();
        e.print(sb);

        System.out.println(sb);
    }
}
