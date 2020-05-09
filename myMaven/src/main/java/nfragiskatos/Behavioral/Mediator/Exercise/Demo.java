package nfragiskatos.Behavioral.Mediator.Exercise;

public class Demo {
    public static void main(String[] args) {

        Mediator mediator = new Mediator();
        Participant p1 = new Participant(mediator);
        Participant p2 = new Participant(mediator);

        System.out.println(p1.value + " should be 0");
        System.out.println(p2.value + " should be 0");

        p1.say(2);
        System.out.println("P1 says 2");

        System.out.println(p1.value + " should be 0");
        System.out.println(p2.value + " should be 2");

        p2.say(4);
        System.out.println("P2 says 4");

        System.out.println(p1.value + " should be 4");
        System.out.println(p2.value + " should be 2");
    }
}
