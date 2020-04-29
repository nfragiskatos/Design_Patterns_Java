package nfragiskatos.StructuralPatterns.Decorator.StaticDecoratorComposition;

public class MyColoredShape<T extends Shape> implements Shape {

    private T shape;
    private String color;

    public MyColoredShape(T shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    public T getShape() {
        return shape;
    }

    @Override
    public String info() {
        return shape.info() + " has color " + color;
    }
}
