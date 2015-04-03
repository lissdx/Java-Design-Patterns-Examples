package pizza.franchising;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
	if (item.equals("cheese")) {
	    return NYStyleCheesePizza.build();
	} else if (item.equals("veggie")) {
	    return NYStyleVeggiePizza.build();
	} else if (item.equals("clam")) {
	    return NYStyleClamPizza.build();
	} else if (item.equals("pepperoni")) {
	    return NYStylePepperoniPizza.build();
	} else {
	    return null;
	}
    }
}
