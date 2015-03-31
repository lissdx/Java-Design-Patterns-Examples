package pizza.simple;

public class PizzaStore {
    PizzaSimpleFactory factory;
	 
	public PizzaStore(PizzaSimpleFactory factory) { 
		this.factory = factory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza;

		pizza = factory.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
