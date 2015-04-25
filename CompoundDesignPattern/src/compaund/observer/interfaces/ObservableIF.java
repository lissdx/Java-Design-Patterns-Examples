package compaund.observer.interfaces;

public interface ObservableIF {
    public void registerObserver( ObserverIF observer);
    public void notifyObservers();
}
