package pizza.simple;
import java.util.ArrayList;
import java.util.List;


public class VeggilePizza extends Pizza {
    public static VeggilePizza build() {
	
	String name = "Veggie Pizza";
	String dough = "Crust";
	String sauce = "Marinara sauce";
	List<String> toppings = new ArrayList<>();
	toppings.add("Shredded mozzarella");
	toppings.add("Grated parmesan");
	toppings.add("Diced onion");
	toppings.add("Sliced mushrooms");
	toppings.add("Sliced red pepper");
	toppings.add("Sliced black olives");
	
	return new VeggilePizza(name, dough, sauce, toppings);
    }

    private VeggilePizza(String name, String dough, String sauce,
	    List<String> toppings) {
	super(name, dough, sauce, toppings);
    }
}
