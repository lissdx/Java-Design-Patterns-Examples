package IteratorPkg;
import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
	private final ArrayList<MenuItem> menuItems;
	private int currentPosition = 0;
	
	public PancakeHouseMenuIterator( final ArrayList<MenuItem> menuItems ) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		boolean hasNext = false;
		if( currentPosition >= menuItems.size() || menuItems.get(currentPosition) == null ){
			hasNext = false;
		} else {
			hasNext = true;
		}
		return hasNext;
	}

	@Override
	public MenuItem next() {
		MenuItem holdMenuItem = menuItems.get(currentPosition);
		this.currentPosition++;
		return holdMenuItem;
	}	
}
