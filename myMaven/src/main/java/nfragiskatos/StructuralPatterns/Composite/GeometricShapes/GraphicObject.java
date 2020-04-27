package nfragiskatos.StructuralPatterns.Composite.GeometricShapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Being able to treat objects OR groups of objects in a uniform fashion.
 *
 * It can behave as its own individual (scalar) Graphic object, or because we have a list of itself, and we have this
 * recursive nature, it can also act as a container or collection of Graphic objects.
 */
public class GraphicObject {
    protected String name = "Group";
    public String color;
    public List<GraphicObject> children = new ArrayList<>();

    public GraphicObject() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void print(StringBuilder sb, int depth) {
        sb.append(String.join("", Collections.nCopies(depth, "*")))
                .append(depth > 0 ? " " : "")
                .append((color == null || color.isEmpty()) ? "" : color + " ")
                .append(getName())
                .append(System.lineSeparator());
        children.forEach(c -> c.print(sb, depth + 1));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        print(sb, 0);
        return sb.toString();
    }
}
