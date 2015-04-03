package pizza.franchising;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
	if (item.equals("cheese")) {
	    return ChicagoStyleCheesePizza.build();
	} else if (item.equals("veggie")) {
	    return ChicagoStyleVeggiePizza.build();
	} else if (item.equals("clam")) {
	    return ChicagoStyleClamPizza.build();
	} else if (item.equals("pepperoni")) {
	    return ChicagoStylePepperoniPizza.build();
	} else {
	    return null;
	}
    }
}
