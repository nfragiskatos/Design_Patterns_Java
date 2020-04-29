package nfragiskatos.StructuralPatterns.Decorator.DynamicDecoratorComposition;

public class TransparentShape implements Shape {

    private Shape shape;
    private int transparency;

    public Shape getShape() {
        return shape;
    }

    public TransparentShape(Shape shape, int transparency) {
        this.shape = shape;
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape.info() + " has " + transparency + " % transparency";
    }
}
