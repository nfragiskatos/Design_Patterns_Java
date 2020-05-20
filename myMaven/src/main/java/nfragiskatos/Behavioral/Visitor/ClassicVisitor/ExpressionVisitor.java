package nfragiskatos.Behavioral.Visitor.ClassicVisitor;

public interface ExpressionVisitor {

    void visit(DoubleExpression e);
    void visit(AdditionExpression e);
}
