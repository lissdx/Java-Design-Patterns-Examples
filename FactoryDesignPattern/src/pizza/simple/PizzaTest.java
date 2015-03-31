package pizza.simple;

public class PizzaTest {
	public static void main(String[] args) {
		PizzaSimpleFactory factory = new PizzaSimpleFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");

		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
	}
}