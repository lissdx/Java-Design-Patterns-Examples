package CustomDecorator.Utils;

public abstract class CondimentDecorator extends Beverage {

	public CondimentDecorator(final String description ) {
		super( description );
	}
	
	protected String getDecoratorDescription(){
		return super.getDescription();
	}
	
	public abstract String getDescription();

}
