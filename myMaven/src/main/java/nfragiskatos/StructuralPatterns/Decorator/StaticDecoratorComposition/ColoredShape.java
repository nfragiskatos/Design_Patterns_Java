package nfragiskatos.StructuralPatterns.Decorator.StaticDecoratorComposition;

import java.util.function.Supplier;

public class ColoredShape<T extends Shape> implements Shape {

    private Shape shape;
    private String color;

    /**
     * The problem is we need to initialize the shape somehow and take in the Shape as an argument, but there's no real
     *
     * shape = new T();
     */
    public ColoredShape(Supplier<? extends T> ctor, String color) {
        shape = ctor.get();
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " has the color " + color;
    }
}
