package pizza.franchising;

import java.util.ArrayList;
import java.util.List;

public class ChicagoStyleVeggiePizza extends Pizza {

    public static ChicagoStyleVeggiePizza build() {
	String name = null;
	String dough = null;
	String sauce = null;
	List<String> toppings = new ArrayList<>();

	name = "Chicago Deep Dish Veggie Pizza";
	dough = "Extra Thick Crust Dough";
	sauce = "Plum Tomato Sauce";

	toppings.add("Shredded Mozzarella Cheese");
	toppings.add("Black Olives");
	toppings.add("Spinach");
	toppings.add("Eggplant");

	return new ChicagoStyleVeggiePizza(name, dough, sauce, toppings);
    }

    private ChicagoStyleVeggiePizza(String name, String dough, String sauce,
	    List<String> toppings) {
	super(name, dough, sauce, toppings);
    }

    public void cut() {
	System.out.println("Cutting the pizza into square slices");
    }

}
