package pizza.simple;
import java.util.ArrayList;
import java.util.List;


public class PepperoniPizza extends Pizza {
    public static PepperoniPizza build() {

	String name = "Pepperoni Pizza";
	String dough = "Crust";
	String sauce = "Marinara sauce";
	List<String> toppings = new ArrayList<>();
	toppings.add("Sliced Pepperoni");
	toppings.add("Sliced Onion");
	toppings.add("Grated parmesan cheese");
	
	return new PepperoniPizza(name, dough, sauce, toppings);
    }

    private PepperoniPizza(String name, String dough, String sauce,
	    List<String> toppings) {
	super(name, dough, sauce, toppings);
    }
}
