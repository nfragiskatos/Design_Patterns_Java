package nfragiskatos.CreationalPatterns.Singleton.TestabilityIssues;

import org.junit.Assert;
import org.junit.Test;



import java.util.List;

public class Tests {
    // Not a proper unit test. Not depending on abstraction. Tightly coupled.
    @Test
    public void singletonTotalPopulationTest() {
        SingletonRecordFinder rf = new SingletonRecordFinder();
        List<String> names = List.of("Seoul", "Mexico City");
        int tp = rf.getTotalPopulation(names);

        Assert.assertEquals(17500000 + 17400000, tp);
    }

    @Test
    public void dependentPopulationTest() {
        DummyDatabase db = new DummyDatabase();
        ConfigurableRecordFinder rf = new ConfigurableRecordFinder(db);

        Assert.assertEquals(4, rf.getTotalPopulation(List.of("alpha", "gamma")));
    }
}
