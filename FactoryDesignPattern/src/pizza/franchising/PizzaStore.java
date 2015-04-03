package pizza.franchising;

public abstract class PizzaStore {

	protected abstract Pizza createPizza(final String type);
	
	public Pizza orderPizza(String type) {
		Pizza pizza;

		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}	
}
