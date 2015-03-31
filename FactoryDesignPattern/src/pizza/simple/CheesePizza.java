package pizza.simple;
import java.util.ArrayList;
import java.util.List;


public class CheesePizza extends Pizza {
    public static CheesePizza build() {
	String name = "Cheese Pizza";
	String dough = "Regular Crust";
	String sauce = "Marinara Pizza Sauce";
	List<String> toppings = new ArrayList<>();
	toppings.add("Fresh Mozzarella");
	toppings.add("Parmesan");
	return new CheesePizza(name, dough, sauce, toppings);
    }

    private CheesePizza(String name, String dough, String sauce,
	    List<String> toppings) {
	super(name, dough, sauce, toppings);
    }

}
