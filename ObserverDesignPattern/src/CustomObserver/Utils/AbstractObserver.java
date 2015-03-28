package CustomObserver.Utils;


public abstract class AbstractObserver<T> implements ObserverIF<T> {

	private T data;
	ObservableIF<T> subject;
	
	protected AbstractObserver( ObservableIF<T> subject ) {
		if( subject != null ){
			this.subject = subject;
			this.subject.registerObserver( this );
		}
	}
	
	@Override
	public void update(ObservableIF<T> subject) {
		
		if( subject != null ){
			this.data = subject.getData();
		}
		
		doOnUpdate(data);
	}
	
	abstract protected void doOnUpdate( T data );
}
