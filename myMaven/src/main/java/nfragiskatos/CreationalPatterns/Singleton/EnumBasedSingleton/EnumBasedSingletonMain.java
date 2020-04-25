package nfragiskatos.CreationalPatterns.Singleton.EnumBasedSingleton;

import nfragiskatos.CreationalPatterns.Singleton.BasicSingleton.BasicSingleton;

import java.io.*;

public class EnumBasedSingletonMain {

    public static void main(String[] args) throws Exception {
        String filename = "myfile.bin";

//        EnumBasedSingleton singleton = EnumBasedSingleton.INSTANCE;
//        singleton.setValue(111);
//        saveToFile(singleton, filename);

        EnumBasedSingleton singleton2 = readFromFile(filename);
        System.out.println(singleton2.getValue());
    }


    static void saveToFile(EnumBasedSingleton singleton, String filename) throws Exception {

        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(singleton);
        }
    }

    static EnumBasedSingleton readFromFile(String filename) throws Exception {
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)
        ) {
            return (EnumBasedSingleton) in.readObject();
        }
    }
}
