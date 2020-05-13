package nfragiskatos.Behavioral.Observer.Exercise;

import java.io.Closeable;
import java.io.IOException;

public class Rat implements Closeable {

    private Game game;
    public int attack = 1;

    public Rat(Game game) {
        this.game = game;
        game.ratEnters.subscribe((sender, arg) -> {
            ++attack;
            game.notifyRat.invoke(this, (Rat) sender);
        });
        game.notifyRat.subscribe((sender, rat) -> {
            if (rat == this) ++attack;
        });
        game.ratDies.subscribe((sender, arg) -> --attack);
        game.ratEnters.invoke(this, null);
    }

    @Override
    public void close() throws IOException {
        game.ratDies.invoke(this, null);
    }
}
