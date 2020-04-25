package nfragiskatos.CreationalPatterns.Singleton.Exercise;

import nfragiskatos.CreationalPatterns.Builder.PersonBuilder.Person;
import nfragiskatos.CreationalPatterns.Singleton.BasicSingleton.BasicSingleton;
import nfragiskatos.CreationalPatterns.Singleton.BasicSingleton.BasicSingletonMain;

public class ExerciseMain {
    public static void main(String[] args) {
        boolean isSingleton = SingletonTester.isSingleton(Person::new);

        System.out.println("Is Singleton for " + Person.class.getSimpleName());
        System.out.println(isSingleton);


        isSingleton = SingletonTester.isSingleton(BasicSingleton::getInstance);
        System.out.println("Is Singleton for " + BasicSingleton.class.getSimpleName());
        System.out.println(isSingleton);
    }

}
