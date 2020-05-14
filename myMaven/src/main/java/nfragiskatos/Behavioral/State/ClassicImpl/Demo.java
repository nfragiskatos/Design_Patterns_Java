package nfragiskatos.Behavioral.State.ClassicImpl;

/**
 * Pattern in which the object's behavior is determined by its state. An object transitions from one state to another by
 * a transition being triggered).
 *
 * Just a state machine.
 */
public class Demo {
    public static void main(String[] args) {
        LightSwitch lightSwitch = new LightSwitch();

        lightSwitch.on();
        lightSwitch.off();
        lightSwitch.off();
    }
}
