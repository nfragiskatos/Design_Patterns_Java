package nfragiskatos.CreationalPatterns.Singleton.TestabilityIssues;

import com.google.common.collect.Iterables;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class SingletonDatabase {

    private Dictionary<String, Integer> capitals = new Hashtable<>();
    private static final SingletonDatabase INSTANCE = new SingletonDatabase();
    private static int instanceCount = 0;

    private SingletonDatabase() {
        instanceCount++;
        System.out.println("Initializing Database...");

        try {
            File f = new File(SingletonDatabase.class.getProtectionDomain().getCodeSource().getLocation().getPath());
            Path fullPath = Paths.get(f.getPath(), "capitals.txt");

            List<String> lines = Files.readAllLines(fullPath);

            Iterables.partition(lines, 2)
                    .forEach(kv ->
                            capitals.put(
                                    kv.get(0).trim(),
                                    Integer.parseInt(kv.get(1))
                            )
                    );


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SingletonDatabase getInstance() {
        return INSTANCE;
    }

    public int getPopulation(String name) {
        return capitals.get(name);
    }


    public static int getCount() {
        return instanceCount;
    }
}
