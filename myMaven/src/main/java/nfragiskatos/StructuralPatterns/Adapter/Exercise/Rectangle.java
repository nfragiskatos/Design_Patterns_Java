package nfragiskatos.StructuralPatterns.Adapter.Exercise;

public interface Rectangle {
    int getWidth();
    int getHeight();

    default int getArea() {
        return getWidth() * getHeight();
    }
}
