package nfragiskatos.Behavioral.Strategy.Dynamic;

public class MarkdownListStrategy implements ListStrategy {
    @Override
    public void addListItem(StringBuilder sb, String item) {
        sb.append(" * ").append(item).append(System.lineSeparator());
    }
}
