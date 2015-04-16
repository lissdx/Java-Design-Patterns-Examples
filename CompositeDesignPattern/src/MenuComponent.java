import java.util.Iterator;



public abstract class MenuComponent {
	
	private final boolean isComposite;
	
	protected MenuComponent( boolean isComposite ) {
		this.isComposite = isComposite;
	}
	
	public void  add(MenuComponent menuComponent ) {
		throw new UnsupportedOperationException();
	}
	
	public void  remove(MenuComponent menuComponent ) {
		throw new UnsupportedOperationException();
	}	
	
	public MenuComponent getChild(int i ) {
		throw new UnsupportedOperationException();
	}
	
	public String getName() {
		throw new UnsupportedOperationException();
	}
	
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	
	public void print() {
		throw new UnsupportedOperationException();
	}

	public boolean isComposite() {
		return isComposite;
	}
	
	public abstract <T extends Iterator<MenuComponent>> T createIterator();


}
