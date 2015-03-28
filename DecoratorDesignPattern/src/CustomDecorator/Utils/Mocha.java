package CustomDecorator.Utils;

public class Mocha extends CondimentDecorator {
	private final Beverage beverage;
	
	public Mocha( final Beverage beverage ) {
		super("Mocha Coffee");
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + getDecoratorDescription();
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

}
