package nfragiskatos.CreationalPatterns.Singleton.BasicSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BasicSingletonMain {

    public static void main(String[] args) throws Exception {

        // Basic use case of singleton
//        BasicSingleton singleton = BasicSingleton.getInstance();
//
//        singleton.setValue(123);
//        System.out.println(singleton.getValue());

        // Problems:

        /*
            1. Reflection: This is the very out of your way approach to really purposely break the singleton paradigm

            2. Serialization: Less obvious, e.g. just reading from a file. As shown below.
         */

        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(111);

        String filename = "singleton.bin";

        saveToFile(singleton, filename);

        singleton.setValue(222);

        BasicSingleton singleton2 = readFromFile(filename);

        System.out.println(singleton == singleton2);
        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());
    }

    static void saveToFile(BasicSingleton singleton, String filename) throws Exception {

        try (FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(singleton);
        }
    }

    static BasicSingleton readFromFile(String filename) throws Exception {
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)
        ) {
            return (BasicSingleton) in.readObject();
        }
    }
}
