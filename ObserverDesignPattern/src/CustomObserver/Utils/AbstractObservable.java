package CustomObserver.Utils;

import java.util.ArrayList;

public abstract class AbstractObservable<T> implements ObservableIF<T> {

	private T data;
	private final ArrayList<ObserverIF<T>> observersArray;

	public AbstractObservable( T data ) {

//		try {
//			Class<T> cls = (Class<T>) this.getClass();
//			this.data = cls.newInstance();
//		} catch (InstantiationException | IllegalAccessException e) {
//			e.printStackTrace();
//		}
		this.data = data;
		observersArray = new ArrayList<>();
	}

	@Override
	public T getData() {
		return this.data;
	}

	@Override
	public void setData( T data) {
		if (data != null) {
			this.data = data;
		}
	}

	@Override
	public void registerObserver(ObserverIF<T> observer) {
		if (observer != null) {
			this.observersArray.add(observer);
		}
	}

	@Override
	public void removeObserver(ObserverIF<T> observer) {
		int index = this.observersArray.indexOf(observer);

		if (index >= 0) {
			this.observersArray.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		for (ObserverIF<T> observer : observersArray) {
			observer.update(this);
		}

	}
}
