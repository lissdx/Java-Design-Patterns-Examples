package CustomObserver.Utils;

public interface ObserverIF<T> {
	public void update(ObservableIF<T> subject);
}
