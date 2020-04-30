package nfragiskatos.StructuralPatterns.Facade;

/**
 * The Facade pattern is all about exposing several components through a single interface.
 *
 * Provide a simple, easy to understand user interface over a large and sophisticated body of code.
 *
 * The user could go in and define all the subsystems and build everything up, or maybe some users don't really care and
 * just want it done for them, therefore you provide a facade to facilitate the ease of use.
 *
 * Of course you could still leave a public interface for the more "power users" who want to customize as much as they
 * want.
 */
public class Demo {
    public static void main(String[] args) {

        /**
         * Currently as is this is complicated for the user. The user must setup and manage all of these subsystems.
         *
         * We could use a Facade to simplify the end-user experience.
         */
//        Buffer buffer = new Buffer(30, 20);
//        Viewport viewport = new Viewport(buffer, 30, 20, 0, 0);
//        Console console = new Console(30, 20);
//        console.addViewport(viewport);
//        console.render();

        /**
         * Simpler user experience
         */

        Console console2 = Console.newConsole(30, 20);
        console2.render();


    }
}
