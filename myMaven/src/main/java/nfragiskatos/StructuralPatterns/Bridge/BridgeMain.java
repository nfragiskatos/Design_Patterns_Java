package nfragiskatos.StructuralPatterns.Bridge;

// Shape -> Circle, Square
// Rendering -> Vector, Raster

// VectorCircleRenderer, VectorSquareRenderer, RasterCircleRenderer, RasterSquareRenderer

import com.google.inject.Guice;
import com.google.inject.Injector;

public class BridgeMain {

    public static void main(String[] args) {

        /**
        Without DPI framework
         */
//        RasterRenderer raster = new RasterRenderer();
//        VectorRenderer vector = new VectorRenderer();
//
//        Circle circle = new Circle(vector, 5);
//        circle.draw();
//        circle.resize(5);
//        circle.draw();

        /**
        Using Google Guice
         */

        Injector injector = Guice.createInjector(new ShapeModule());
        Circle instance = injector.getInstance(Circle.class);
        instance.radius = 3;
        instance.draw();
        instance.resize(5);
        instance.draw();
    }
}
