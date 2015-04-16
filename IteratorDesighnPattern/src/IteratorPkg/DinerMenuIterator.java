package IteratorPkg;


public class DinerMenuIterator implements Iterator<MenuItem>{
	private int currentPosition = 0;
	private final MenuItem[] menuItems;

	public DinerMenuIterator( final MenuItem[] menuItems) {
		this.menuItems = menuItems;			
	}

	@Override
	public boolean hasNext() {
		boolean hasNext = false;
		if( currentPosition >= menuItems.length || menuItems[ currentPosition ] == null ){
			hasNext = false;
		} else {
			hasNext = true;
		}
		return hasNext;
	}

	@Override
	public MenuItem next() {
		MenuItem holdMenuItem = this.menuItems[ this.currentPosition ];
		this.currentPosition++;
		return holdMenuItem;
	}	
}
