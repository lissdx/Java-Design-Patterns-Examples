package pizza.franchising;

import java.util.ArrayList;
import java.util.List;

public class ChicagoStylePepperoniPizza extends Pizza {

    public static ChicagoStylePepperoniPizza build() {
	String name = null;
	String dough = null;
	String sauce = null;
	List<String> toppings = new ArrayList<>();

	name = "Chicago Style Pepperoni Pizza";
	dough = "Extra Thick Crust Dough";
	sauce = "Plum Tomato Sauce";

	toppings.add("Shredded Mozzarella Cheese");
	toppings.add("Black Olives");
	toppings.add("Spinach");
	toppings.add("Eggplant");
	toppings.add("Sliced Pepperoni");

	return new ChicagoStylePepperoniPizza(name, dough, sauce, toppings);
    }

    private ChicagoStylePepperoniPizza(String name, String dough, String sauce,
	    List<String> toppings) {
	super(name, dough, sauce, toppings);
    }

    public void cut() {
	System.out.println("Cutting the pizza into square slices");
    }
}
