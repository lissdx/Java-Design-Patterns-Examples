package CustomDecorator.Utils;

public class Whip extends CondimentDecorator {
	private final Beverage beverage;

	public Whip(final Beverage beverage) {
		super("Whip Coffee");
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + getDecoratorDescription();
	}

	@Override
	public double cost() {
		return 0.10 + beverage.cost();
	}

}
