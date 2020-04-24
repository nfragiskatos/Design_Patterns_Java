package nfragiskatos.CreationalPatterns.Prototype.Cloneable;

public class Address implements Cloneable {

    public String streetName;
    public int houseNumber;

    public Address(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Address(streetName, houseNumber);
    }
}
