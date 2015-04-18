


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
    public String toString() {
        StringBuffer strBuffer = new StringBuffer();
        
        strBuffer.append(" " + getName() );
        if( isVegetarian() ){
            strBuffer.append(" " + "(V)" );
        }
        strBuffer.append(", " + getPrice());
        strBuffer.append("    -- " + getDescription());
        return strBuffer.toString();
    }
    
	@SuppressWarnings("unchecked")
    @Override
	public CompositeNullIterator createIterator() {
		return new CompositeNullIterator();
	}	
}
