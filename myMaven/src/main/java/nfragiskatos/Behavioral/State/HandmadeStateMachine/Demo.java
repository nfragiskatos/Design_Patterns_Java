package nfragiskatos.Behavioral.State.HandmadeStateMachine;



import org.javatuples.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {

    private static Map<State, List<Pair<Trigger, State>>> rules = new HashMap<>();

    /**
     * Define the rules for the state machine. We have a state, and then for each state there is a trigger and subsequent
     * new state that we transition to based off of what the trigger is.
     */
    static {
        rules.put(State.OFF_HOOK, List.of(
                new Pair<>(Trigger.CALL_DIALED, State.CONNECTING),
                new Pair<>(Trigger.STOP_USING_PHONE, State.ON_HOOK)
        ));
        rules.put(State.CONNECTING, List.of(
                new Pair<>(Trigger.HUNG_UP, State.OFF_HOOK),
                new Pair<>(Trigger.CALL_CONNECTED, State.CONNECTED)
        ));
        rules.put(State.CONNECTED, List.of(
                new Pair<>(Trigger.LEFT_MESSAGE, State.OFF_HOOK),
                new Pair<>(Trigger.HUNG_UP, State.OFF_HOOK),
                new Pair<>(Trigger.PLACED_ON_HOLD, State.ON_HOLD)
        ));
        rules.put(State.ON_HOLD, List.of(
                new Pair<>(Trigger.TAKEN_OFF_HOLD, State.CONNECTED),
                new Pair<>(Trigger.HUNG_UP, State.OFF_HOOK)
        ));
    }

    private static State currentState = State.OFF_HOOK;
    private static State exitState = State.ON_HOOK;


    public static void main(String[] args) {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("The phone is currently " + currentState);
            System.out.println("Select a trigger");

            for (int i = 0; i < rules.get(currentState).size(); ++i) {
                Trigger trigger = rules.get(currentState).get(i).getValue0();
                System.out.println("" + i + ". " + trigger);
            }

            boolean parseOk = false;
            int choice = 0;

            do {
                try {
                    System.out.println("Please enter your choice:");
                    choice = Integer.parseInt(console.readLine());
                    parseOk = choice >= 0 & choice < rules.get(currentState).size();
                } catch (IOException e) {
                    parseOk = false;
                }
            } while (!parseOk);

            currentState = rules.get(currentState).get(choice).getValue1();

            if (currentState == exitState) break;
        }
        System.out.println("And we are done!");
    }
}
