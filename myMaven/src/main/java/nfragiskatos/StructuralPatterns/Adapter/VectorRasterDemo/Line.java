package nfragiskatos.StructuralPatterns.Adapter.VectorRasterDemo;

public class Line {

    public Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }


    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
