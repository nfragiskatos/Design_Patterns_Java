package nfragiskatos.StructuralPatterns.Adapter.Exercise;

public class ExerciseMain {
    public static void main(String[] args) {
        Square square = new Square(10);
        SquareToRectangleAdapter adapter = new SquareToRectangleAdapter(square);

        System.out.println("Is a rectangle: " + (adapter instanceof Rectangle));
        System.out.println("getWidth() = " + adapter.getWidth());
        System.out.println("getHeight() = " + adapter.getHeight());
    }
}
