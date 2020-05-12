package nfragiskatos.Behavioral.Observer.ObserverAndObservable;

/**
 * Need to be informed when a certain event happens. List to those events and be notified when those events occur.
 * Typical pattern involves the addXxxxxListener
 *
 * An object (observer) that wishes to be informed about event happening in system.
 * The entity generating the events is an observable.
 */
public class Demo implements Observer<Person> {
    public static void main(String[] args) {

        new Demo();
    }

    public Demo() {
        Person person = new Person();
        person.subscribe(this);

        for (int i = 20; i < 24; ++i) {
            person.setAge(i);
        }
    }

    @Override
    public void handle(PropertyChangedEventArgs<Person> args) {
        System.out.println("Person's " + args.propertyName + " has changed to " + args.newValue);
    }
}
