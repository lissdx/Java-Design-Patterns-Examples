package pizza.franchising;

import java.util.ArrayList;
import java.util.List;

public class NYStylePepperoniPizza extends Pizza {

    
    public static NYStylePepperoniPizza build() {
	String name = null;
	String dough = null;
	String sauce = null;
	List<String> toppings = new ArrayList<>();
	
	name = "NY Style Pepperoni Pizza";
	dough = "Thin Crust Dough";
	sauce = "Marinara Sauce";

	toppings.add("Grated Reggiano Cheese");
	toppings.add("Sliced Pepperoni");
	toppings.add("Garlic");
	toppings.add("Onion");
	toppings.add("Mushrooms");
	toppings.add("Red Pepper");
	
	return new NYStylePepperoniPizza(name, dough, sauce, toppings);
    }

    private NYStylePepperoniPizza(String name, String dough, String sauce,
	    List<String> toppings) {
	super(name, dough, sauce, toppings);
    }

}
