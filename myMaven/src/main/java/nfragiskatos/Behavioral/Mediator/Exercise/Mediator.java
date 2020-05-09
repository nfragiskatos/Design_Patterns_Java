package nfragiskatos.Behavioral.Mediator.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Participant> participants = new ArrayList<>();

    public void broadcast(Object sender, int n) {
        for (Participant p : participants) {
            p.notify(sender, n);
        }
    }

    public void addListener(Participant p) {
        participants.add(p);
    }
}
