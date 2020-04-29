package nfragiskatos.StructuralPatterns.Decorator.DynamicDecoratorComposition;

public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColoredShape blueSquare = new ColoredShape(new Square(20), "blue");
        System.out.println(blueSquare.info());

        TransparentShape myCircle = new TransparentShape(
                new ColoredShape(new Circle(5), "Green"),
                50
        );

        /**
         * Here is a small problem with the design, and that this code is invalid because TransparentShape is not actually
         * a circle, because we aren't doing traditional inheritance.
         *
         * Of course there are ways around this.
         */
        System.out.println(myCircle.info());
    }
}
