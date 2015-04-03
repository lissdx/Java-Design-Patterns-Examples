package pizza.franchising;

public class DependentPizzaStore {
    public Pizza createPizza(String style, String type) {
	Pizza pizza = null;
	if (style.equals("NY")) {
	    if (type.equals("cheese")) {
		pizza = NYStyleCheesePizza.build();
	    } else if (type.equals("veggie")) {
		pizza = NYStyleVeggiePizza.build();
	    } else if (type.equals("clam")) {
		pizza = NYStyleClamPizza.build();
	    } else if (type.equals("pepperoni")) {
		pizza = NYStylePepperoniPizza.build();
	    }
	} else if (style.equals("Chicago")) {
	    if (type.equals("cheese")) {
		pizza = ChicagoStyleCheesePizza.build();
	    } else if (type.equals("veggie")) {
		pizza = ChicagoStyleVeggiePizza.build();
	    } else if (type.equals("clam")) {
		pizza = ChicagoStyleClamPizza.build();
	    } else if (type.equals("pepperoni")) {
		pizza = ChicagoStylePepperoniPizza.build();
	    }
	} else {
	    System.out.println("Error: invalid type of pizza");
	    return null;
	}
	pizza.prepare();
	pizza.bake();
	pizza.cut();
	pizza.box();
	return pizza;
    }
}
