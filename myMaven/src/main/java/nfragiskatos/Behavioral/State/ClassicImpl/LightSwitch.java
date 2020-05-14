package nfragiskatos.Behavioral.State.ClassicImpl;

public class LightSwitch {
    private State state; //OnState, OffState

    public LightSwitch() {
        state = new OffState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void on() {
        state.on(this);
    }

    public void off() {
        state.off(this);
    }
}
