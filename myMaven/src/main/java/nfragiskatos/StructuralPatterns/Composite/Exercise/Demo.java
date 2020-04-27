package nfragiskatos.StructuralPatterns.Composite.Exercise;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        SingleValue singleValue = new SingleValue(11);
        ManyValues otherValues = new ManyValues();
        otherValues.add(22);
        otherValues.add(33);

        int sum = new MyList(List.of(singleValue, otherValues)).sum();
        System.out.println("Sum: " + sum);
    }
}
