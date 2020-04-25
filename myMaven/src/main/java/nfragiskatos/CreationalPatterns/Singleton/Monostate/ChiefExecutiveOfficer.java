package nfragiskatos.CreationalPatterns.Singleton.Monostate;


/*
This is actually a variation of the Singleton pattern:
Essentially have a class that looks like a normal class but we make the fields inside static. Hence the name of the
pattern "Monostate"

Make as many instances as you want, because everything maps to static fields.

Not a nice pattern, because it's no easily identifiable that the class is trying to behave as a singleton. Can be
confusing to the client.
 */
public class ChiefExecutiveOfficer {
    private static String name;
    private static int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        ChiefExecutiveOfficer.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        ChiefExecutiveOfficer.age = age;
    }

    @Override
    public String toString() {
        return "ChiefExecutiveOfficer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
