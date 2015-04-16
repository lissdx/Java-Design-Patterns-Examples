import java.util.Iterator;
import java.util.Stack;



public class CompositeIterator implements Iterator<MenuComponent>{

	//private final Iterator<? extends MenuComponent> iterator;
	private final Stack<Iterator<? extends MenuComponent>> stack;
	
	public CompositeIterator( Iterator<? extends MenuComponent> iterator ) {
		stack = new Stack<>( );
		stack.push( iterator );
		//this.iterator = iterator;
	}
	
	@Override
	public boolean hasNext() {
		//return iterator.hasNext();
		return false;
	}

	@Override
	public MenuComponent next() {
		//return iterator.next();
		if( )
		return false;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
		//iterator.remove();		
	}

}
