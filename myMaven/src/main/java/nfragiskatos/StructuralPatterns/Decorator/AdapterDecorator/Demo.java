package nfragiskatos.StructuralPatterns.Decorator.AdapterDecorator;

public class Demo {
    public static void main(String[] args) {

        MyStringBuilder mySb = new MyStringBuilder();

        mySb.append("Hello").appendLine(" world");

        System.out.println(mySb.concat("and this too"));
    }
}
