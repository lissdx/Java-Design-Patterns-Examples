
import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	final ArrayList<MenuComponent> menuComponents = new ArrayList<>();
	final String name;
	final String description;

	public Menu(final String name, final String description) {
		super(true);
		this.name = name;
		this.description = description;
	}

	@Override
	public void add(MenuComponent menuComponent) {
		this.menuComponents.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		this.menuComponents.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i) {
		return this.menuComponents.get(i);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("--------------------");

		for (MenuComponent menuComponent : this.menuComponents) {
			menuComponent.print();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public  CompositeIterator createIterator() {
		return new CompositeIterator(menuComponents.iterator());
	}
	// public <T extends Iterator<MenuComponent>> T createIterator() {
	// return (T) new CompositeIterator( menuComponents.iterator() );
	// }

	// public Iterator<? extends MenuComponent> T createIterator() {
	// return new CompositeIterator( menuComponents.iterator() );
	// }
}
