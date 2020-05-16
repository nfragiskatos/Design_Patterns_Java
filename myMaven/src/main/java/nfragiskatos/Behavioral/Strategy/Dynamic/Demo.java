package nfragiskatos.Behavioral.Strategy.Dynamic;

import java.util.List;

/**
 * Enables the exact behavior of  system to be selected either at run-time (dynamic) or compile-time (static)
 *
 * A.K.A. "Policy" especially in the C++ world.
 */
public class Demo {
    public static void main(String[] args) {
        TextProcessor tp = new TextProcessor(OutputFormat.MARKDOWN);

        tp.appendList(List.of("liberte", "egalite", "fraternite"));
        System.out.println(tp);

        tp.clear();
        tp.setOutputFormat(OutputFormat.HTML);
        tp.appendList(List.of("inheritence", "encapsulation", "polymorphism"));
        System.out.println(tp);
    }
}
