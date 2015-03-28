package CustomObserver.Utils;

public interface ObservableIF<T> extends DataIF<T> {

	public void registerObserver(ObserverIF<T> observer);
	public void removeObserver(ObserverIF<T> observer);
	public void notifyObservers( );
	
}
