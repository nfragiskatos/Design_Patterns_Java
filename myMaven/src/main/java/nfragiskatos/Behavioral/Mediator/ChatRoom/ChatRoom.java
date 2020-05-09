package nfragiskatos.Behavioral.Mediator.ChatRoom;

import java.util.ArrayList;
import java.util.List;

/**
 * Here is the mediator that all participants have in common, but they don't have a reference to one another.
 */
public class ChatRoom {

    private List<Person> people = new ArrayList<>();

    public void join(Person p) {
        String joinMsg = p.name + " joins the room";
        broadcast("room", joinMsg);

        p.room = this;
        people.add(p);
    }

    public void broadcast(String source, String msg) {
        for (Person person : people) {
            if (!person.name.equals(source)) {
                person.receive(source, msg);
            }
        }
    }

    public void msg(String source, String destination, String msg) {
        people.stream()
                .filter(p -> p.name.equals(destination))
                .findFirst()
                .ifPresent(p -> p.receive(source, msg));
    }
}
