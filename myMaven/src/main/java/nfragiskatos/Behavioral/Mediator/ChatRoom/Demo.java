package nfragiskatos.Behavioral.Mediator.ChatRoom;


/**
 * Facilitates communication between components by letting components be unaware of each other's presence or absence in
 * system.
 */
public class Demo {
    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();

        Person john = new Person("John");
        Person jane = new Person("Jane");

        room.join(john);
        room.join(jane);

        john.say("hi room");
        jane.say("hey john");

        Person simon = new Person("Simon");
        room.join(simon);
        simon.say("hi everyone");

        jane.privateMsg("Simon", "glad you could join us!");
    }
}
