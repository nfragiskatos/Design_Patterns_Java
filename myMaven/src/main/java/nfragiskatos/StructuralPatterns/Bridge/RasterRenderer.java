package nfragiskatos.StructuralPatterns.Bridge;

public class RasterRenderer implements  Renderer{
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing pixels for a circle of radius " + radius);
    }
}
