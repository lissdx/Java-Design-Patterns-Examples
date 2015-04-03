package pizza.abstractFactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
	Pizza pizza = null;
	PizzaIngredientFactoryIF pizzaIngredientFactory = new NYPpizzaIngredientFactory();
	
	if (item.equals("cheese")) {
	    pizza = CheesePizza.build( pizzaIngredientFactory );
	    pizza.setName("New York Style Cheese Pizza");
	} else if (item.equals("veggie")) {
	    pizza = VeggiePizza.build( pizzaIngredientFactory );
	    pizza.setName("New York Style Veggie Pizza");	    
	} else if (item.equals("clam")) {
	    pizza = ClamPizza.build( pizzaIngredientFactory );
	    pizza.setName("New York Style Clam Pizza");
	} else if (item.equals("pepperoni")) {
	    pizza = PepperoniPizza.build( pizzaIngredientFactory );
	    pizza.setName("New York Style Pepperoni Pizza");
	}
	
	return pizza;
    }
}
