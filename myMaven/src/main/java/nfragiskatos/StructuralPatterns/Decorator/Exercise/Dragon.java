package nfragiskatos.StructuralPatterns.Decorator.Exercise;

public class Dragon {
    private int age;
    private Lizard lizard;
    private Bird bird;

    public Dragon() {
        lizard = new Lizard();
        bird = new Bird();
    }

    public void setAge(int age) {
        lizard.age = age;
        bird.age = age;
        this.age = age;
    }

    public String fly() {
        return bird.fly();
    }

    public String crawl() {
        return lizard.crawl();
    }
}
