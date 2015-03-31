package pizza.simple;
import java.util.List;

abstract public class Pizza {
    private final String name;
    private final String dough;
    private final String sauce;
    private final List<String> toppings;
    
    protected Pizza( final String name, final String dough, final String sauce, final List<String> toppings){
	this.name = name;
	this.dough = dough;
	this.sauce = sauce;
	this.toppings = toppings;
    }
    
    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (int i = 0; i < toppings.size(); i++) {
            display.append(toppings.get(i) + "\n");
        }
        return display.toString();
    }
}