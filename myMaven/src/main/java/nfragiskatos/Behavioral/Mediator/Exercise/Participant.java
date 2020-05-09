package nfragiskatos.Behavioral.Mediator.Exercise;

public class Participant {

    private Mediator mediator;
    public int value;

    public Participant(Mediator mediator)
    {
        mediator.addListener(this);
        this.mediator = mediator;

    }

    public void say(int n)
    {
        mediator.broadcast(this, n);
    }

    public void notify(Object sender, int n) {
        if (this != sender) {
            value += n;
        }
    }
}
