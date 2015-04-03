package pizza.abstractFactory;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies veggies[];
    Pepperoni pepperoni;
    Clams clams;

    protected Pizza(Dough dough, Sauce sause, Cheese cheese, Veggies[] veggies, Pepperoni papperoni, Clams clams) {
	this.dough = dough;
	this.sauce = sause;
	this.cheese = cheese;
	this.veggies = veggies;
	this.pepperoni = papperoni;
	this.clams = clams;
    }

    abstract protected void prepare();

    protected void bake() {
	System.out.println("Bake for 25 minutes at 350");
    }

    protected void cut() {
	System.out.println("Cuttin the pizza into diagonal slices");
    }

    protected void box() {
	System.out.println("Place pizza in offical PizzaStore box");
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clams != null) {
			result.append(clams);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}
		return result.toString();
	}
    
}
