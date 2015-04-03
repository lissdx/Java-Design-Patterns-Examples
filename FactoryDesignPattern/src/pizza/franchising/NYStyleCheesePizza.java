package pizza.franchising;

import java.util.ArrayList;
import java.util.List;

public class NYStyleCheesePizza extends Pizza {

    public static NYStyleCheesePizza build() {
	String name = null;
	String dough = null;
	String sauce = null;
	List<String> toppings = new ArrayList<>();

	name = "NY Style Sauce and Cheese Pizza";
	dough = "Thin Crust Dough";
	sauce = "Marinara Sauce";

	toppings.add("Grated Reggiano Cheese");
	return new NYStyleCheesePizza(name, dough, sauce, toppings);
    }

    private NYStyleCheesePizza(String name, String dough, String sauce,
	    List<String> toppings) {
	super(name, dough, sauce, toppings);
    }
    

}
