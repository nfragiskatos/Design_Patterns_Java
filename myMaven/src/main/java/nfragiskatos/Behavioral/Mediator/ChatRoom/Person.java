package nfragiskatos.Behavioral.Mediator.ChatRoom;

import java.util.ArrayList;
import java.util.List;

public class Person {

    public String name;
    private List<String> chatLog = new ArrayList<>();
    public ChatRoom room;

    public Person(String name) {
        this.name = name;
    }

    public void receive(String sender, String msg) {
        String s = sender + ": '" + msg + "'";
        System.out.println("[" + name + "'s chat session] " + s);
        chatLog.add(s);
    }

    public void say(String msg) {
        room.broadcast(name, msg);
    }

    public void privateMsg(String who, String msg) {
        room.msg(name, who, msg);
    }
}
