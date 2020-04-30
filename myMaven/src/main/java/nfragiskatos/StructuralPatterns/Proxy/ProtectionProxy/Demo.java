package nfragiskatos.StructuralPatterns.Proxy.ProtectionProxy;

/**
 * Class that acts as an interface to a particular resource. The resource may be remote, expensive to construct,
 * or may require logging or some other added functionality.
 */
public class Demo {
    public static void main(String[] args) {

        Car car = new Car(new Driver(12));
        car.drive();

        CarProxy carProxy = new CarProxy(new Driver(12));
        carProxy.drive();
    }
}
