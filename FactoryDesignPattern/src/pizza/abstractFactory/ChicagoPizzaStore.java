package pizza.abstractFactory;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactoryIF ingredientFactory = new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {
		    pizza = CheesePizza.build( ingredientFactory );
		    pizza.setName("Chicago Style Cheese Pizza");
		} else if (item.equals("veggie")) {
		    pizza = VeggiePizza.build( ingredientFactory );
		    pizza.setName("Chicago Style Veggie Pizza");	    
		} else if (item.equals("clam")) {
		    pizza = ClamPizza.build( ingredientFactory );
		    pizza.setName("Chicago Style Clam Pizza");
		} else if (item.equals("pepperoni")) {
		    pizza = PepperoniPizza.build( ingredientFactory );
		    pizza.setName("Chicago Style Pepperoni Pizza");
		}
		
		return pizza;
	}
}



