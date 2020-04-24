package nfragiskatos.CreationalPatterns.Prototype.Exercise;

public class Line {
    public Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line deepCopy() {
        Point start = new Point(this.start.x, this.start.y);
        Point end = new Point(this.end.x, this.end.y);
        return new Line(start, end);
    }
}
