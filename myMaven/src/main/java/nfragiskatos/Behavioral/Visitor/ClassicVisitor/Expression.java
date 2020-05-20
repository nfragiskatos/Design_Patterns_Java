package nfragiskatos.Behavioral.Visitor.ClassicVisitor;

public abstract class Expression {
    public abstract void accept(ExpressionVisitor visitor);
}
