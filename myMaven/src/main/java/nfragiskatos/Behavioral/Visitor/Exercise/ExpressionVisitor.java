package nfragiskatos.Behavioral.Visitor.Exercise;

public abstract class ExpressionVisitor {
    abstract void visit(Value value);
    abstract void visit(AdditionExpression ae);
    abstract void visit(MultiplicationExpression me);
}
