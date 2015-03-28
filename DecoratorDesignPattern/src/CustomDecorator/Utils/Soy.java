package CustomDecorator.Utils;

public class Soy extends CondimentDecorator {
	private final Beverage beverage;
	
	public Soy( final Beverage beverage ) {
		super("Soy Coffee");
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + getDecoratorDescription();
	}

	@Override
	public double cost() {
		return 0.15 + beverage.cost();
	}

}
