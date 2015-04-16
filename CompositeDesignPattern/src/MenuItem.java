import java.util.Iterator;



public class MenuItem extends MenuComponent {
	private final String name;
	private final String description;
	private final boolean vegetarian;
	private final double price;

	public MenuItem(final String name, final String description, final boolean vegetarian, final double price) {
		super(false);
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
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
	public boolean isVegetarian() {
		return vegetarian;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void print() {
		System.out.print(" " + getName() );
		if( isVegetarian() ){
			System.out.print(" " + "(V)" );
		}
		System.out.println(", " + getPrice() );
		System.out.println("    -- " + getDescription() );
	}

	@Override
	public CompositeNullIterator createIterator() {
		return new CompositeNullIterator();
	}	
}
