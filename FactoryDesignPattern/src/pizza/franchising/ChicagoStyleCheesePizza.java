package pizza.franchising;

import java.util.ArrayList;
import java.util.List;

public class ChicagoStyleCheesePizza extends Pizza {

    public static ChicagoStyleCheesePizza build() {
	String name = null;
	String dough = null;
	String sauce = null;
	List<String> toppings = new ArrayList<>();

	name = "Chicago Style Deep Dish Cheese Pizza";
	dough = "Extra Thick Crust Dough";
	sauce = "Plum Tomato Sauce";

	toppings.add("Shredded Mozzarella Cheese");
	return new ChicagoStyleCheesePizza(name, dough, sauce, toppings);
    }
    private ChicagoStyleCheesePizza(String name, String dough, String sauce,
	    List<String> toppings) {
	super(name, dough, sauce, toppings);
    }

    public void cut() {
	System.out.println("Cutting the pizza into square slices");
    }


}
