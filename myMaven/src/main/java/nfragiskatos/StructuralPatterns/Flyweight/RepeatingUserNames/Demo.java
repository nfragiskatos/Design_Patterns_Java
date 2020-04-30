package nfragiskatos.StructuralPatterns.Flyweight.RepeatingUserNames;

/**
 * Flyweight pattern is just a space optimization technique  that lets us use less memory by storing externally
 * the data associated with similar objects
 */
public class Demo {

    public static void main(String[] args) {

        /**
         * Saving the five bites by not storing 'Smith' twice, and also the space character.
         */
        User user1 = new User("John Smith");
        User user2 = new User("Jane Smith");


    }
}
