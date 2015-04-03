package pizza.franchising;

import java.util.ArrayList;
import java.util.List;

public class NYStyleVeggiePizza extends Pizza {

    public static NYStyleVeggiePizza build() {
	String name = null;
	String dough = null;
	String sauce = null;
	List<String> toppings = new ArrayList<>();
	
	name = "NY Style Veggie Pizza";
	dough = "Thin Crust Dough";
	sauce = "Marinara Sauce";

	toppings.add("Grated Reggiano Cheese");
	toppings.add("Garlic");
	toppings.add("Onion");
	toppings.add("Mushrooms");
	toppings.add("Red Pepper");
	
	return new NYStyleVeggiePizza(name, dough, sauce, toppings);
    }

    private NYStyleVeggiePizza(String name, String dough, String sauce,
	    List<String> toppings) {
	super(name, dough, sauce, toppings);
    }

}
