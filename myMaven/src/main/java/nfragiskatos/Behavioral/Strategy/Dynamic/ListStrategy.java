package nfragiskatos.Behavioral.Strategy.Dynamic;

public interface ListStrategy {
    default void start(StringBuilder sb) {}
    default void end(StringBuilder sb) {}
    void addListItem(StringBuilder sb, String item);
}
