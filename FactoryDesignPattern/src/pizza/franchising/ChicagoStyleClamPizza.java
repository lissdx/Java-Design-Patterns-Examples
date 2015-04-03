package pizza.franchising;

import java.util.ArrayList;
import java.util.List;

public class ChicagoStyleClamPizza extends Pizza {

    public static ChicagoStyleClamPizza build() {
	String name = null;
	String dough = null;
	String sauce = null;
	List<String> toppings = new ArrayList<>();

	name = "Chicago Style Clam Pizza";
	dough = "Extra Thick Crust Dough";
	sauce = "Plum Tomato Sauce";

	toppings.add("Shredded Mozzarella Cheese");
	toppings.add("Frozen Clams from Chesapeake Bay");

	return new ChicagoStyleClamPizza(name, dough, sauce, toppings);
    }

    private ChicagoStyleClamPizza(String name, String dough, String sauce,
	    List<String> toppings) {
	super(name, dough, sauce, toppings);
    }
    
    public void cut() {
	System.out.println("Cutting the pizza into square slices");
    }

}
