package pizza.simple;

public class PizzaSimpleFactory {
    public Pizza createPizza(String type) {

	Pizza pizza = null;

	if (type.equals("cheese")) {
	    pizza = CheesePizza.build();
	} else if (type.equals("pepperoni")) {
	    pizza = PepperoniPizza.build();
	} else if (type.equals("clam")) {
	    pizza = ClamPizza.build();
	} else if (type.equals("veggie")) {
	    pizza = VeggilePizza.build();
	}

	return pizza;
    }
}
