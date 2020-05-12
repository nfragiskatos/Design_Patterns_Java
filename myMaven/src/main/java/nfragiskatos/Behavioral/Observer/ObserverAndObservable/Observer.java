package nfragiskatos.Behavioral.Observer.ObserverAndObservable;

public interface Observer<T> {
    void handle(PropertyChangedEventArgs<T> args);
}
