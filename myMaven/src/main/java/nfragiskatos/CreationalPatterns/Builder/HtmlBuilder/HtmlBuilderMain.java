package nfragiskatos.CreationalPatterns.Builder.HtmlBuilder;

public class HtmlBuilderMain {

    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder("ul")
                .addChild("li", "hello")
                .addChild("li", "world");
        System.out.println(builder);
    }
}
