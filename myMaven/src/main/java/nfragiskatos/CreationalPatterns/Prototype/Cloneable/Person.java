package nfragiskatos.CreationalPatterns.Prototype.Cloneable;

import java.util.Arrays;

public class Person implements Cloneable {

    public String [] names;
    public Address address;

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Person(
                names.clone(),
                address instanceof Cloneable ? (Address) address.clone() : address
        );
    }
}
