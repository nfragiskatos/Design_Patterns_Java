package nfragiskatos.StructuralPatterns.Decorator.StaticDecoratorComposition;

public class Demo {
    public static void main(String[] args) {

        ColoredShape<Square> blueSquare = new ColoredShape<>(
                () -> new Square(20),
                "blue"
        );

        System.out.println(blueSquare.info());

        TransparentShape<ColoredShape<Circle>> myCircle = new TransparentShape<>(
                () -> new ColoredShape<>(
                        () -> new Circle(5),
                        "red"
                ),
                50
        );

        System.out.println(myCircle.info());

        MyColoredShape<Circle> myColoredShape = new MyColoredShape<>(new Circle(200), "pink");

        System.out.println(myColoredShape.info());

        myColoredShape.getShape().resize(30);
        System.out.println(myColoredShape.info());
    }
}
