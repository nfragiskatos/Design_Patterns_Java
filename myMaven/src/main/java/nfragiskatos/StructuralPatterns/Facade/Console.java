package nfragiskatos.StructuralPatterns.Facade;

import java.util.ArrayList;
import java.util.List;

public class Console {

    private List<Viewport> viewports = new ArrayList<>();
    private int width, height;

    public Console(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addViewport(Viewport viewport) {
        viewports.add(viewport);
    }

    public void render() {
        for (int y = 0; y < height; ++ y) {
            for (int x = 0; x < width; ++x) {
                for (Viewport vp : viewports) {
                    System.out.print(vp.charAt(x, y));
                }
            }
            System.out.println();
        }
    }

    /**
     * Adding functionality to simplify user experience
     */
    public static Console newConsole(int width, int height) {
        Buffer buffer = new Buffer(width, height);
        Viewport viewport = new Viewport(buffer, width, height, 0, 0);
        Console console = new Console(width, height);
        console.addViewport(viewport);
        return console;
    }
}
