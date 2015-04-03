package pizza.franchising;

import java.util.ArrayList;
import java.util.List;

public class NYStyleClamPizza extends Pizza {

    public static NYStyleClamPizza build() {
	String name = null;
	String dough = null;
	String sauce = null;
	List<String> toppings = new ArrayList<>();

	name = "NY Style Clam Pizza";
	dough = "Thin Crust Dough";
	sauce = "Marinara Sauce";

	toppings.add("Grated Reggiano Cheese");
	toppings.add("Fresh Clams from Long Island Sound");
	
	return new NYStyleClamPizza(name, dough, sauce, toppings);
    }

    private NYStyleClamPizza(String name, String dough, String sauce,
	    List<String> toppings) {
	super(name, dough, sauce, toppings);
    }
    
}
