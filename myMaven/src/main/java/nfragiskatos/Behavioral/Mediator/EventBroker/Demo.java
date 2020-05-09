package nfragiskatos.Behavioral.Mediator.EventBroker;

public class Demo {
    public static void main(String[] args) {

        EventBroker broker = new EventBroker();
        FootballPlayer player = new FootballPlayer(broker, "Jones");
        FootballCoach coach = new FootballCoach(broker);

        player.score();
        player.score();
        player.score();
    }
}
