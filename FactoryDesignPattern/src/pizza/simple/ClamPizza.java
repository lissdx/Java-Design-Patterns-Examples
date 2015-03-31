package pizza.simple;
import java.util.ArrayList;
import java.util.List;

public class ClamPizza extends Pizza {
    public static ClamPizza build() {
	String name = "Clam Pizza";
	String dough = "Thin crust";
	String sauce = "White garlic sauce";
	List<String> toppings = new ArrayList<>();
	toppings.add("Clams");
	toppings.add("Grated parmesan cheese");
	return new ClamPizza(name, dough, sauce, toppings);
    }

    private ClamPizza(String name, String dough, String sauce,
	    List<String> toppings) {
	super(name, dough, sauce, toppings);
    }

}
