package CustomDecorator.Utils;

public class Decaf extends Beverage {
	public Decaf() {
		super( "Decaf Coffee" );
	}
 
	public double cost() {
		return 1.05;
	}
}