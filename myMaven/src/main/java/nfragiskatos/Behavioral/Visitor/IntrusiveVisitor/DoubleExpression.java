package nfragiskatos.Behavioral.Visitor.IntrusiveVisitor;

public class DoubleExpression extends Expression{

    private double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

    @Override
    void print(StringBuilder sb) {
        sb.append(value);
    }
}
