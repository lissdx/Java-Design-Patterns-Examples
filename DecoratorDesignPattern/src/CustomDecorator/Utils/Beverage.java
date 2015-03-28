package CustomDecorator.Utils;

public abstract class Beverage {
	public final String description;
	
	public Beverage( final String description ) {
		this.description = description;		
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public abstract double cost();
}
