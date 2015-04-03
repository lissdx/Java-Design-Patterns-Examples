package pizza.abstractFactory;

public class VeggiePizza extends Pizza {

    public static VeggiePizza build(PizzaIngredientFactoryIF ingredientFactory) {

	return new VeggiePizza(ingredientFactory.createDough(),
		ingredientFactory.createSauce(),
		ingredientFactory.createCheese(),
		ingredientFactory.createVeggies(),
		ingredientFactory.createPepperoni(),
		ingredientFactory.createClams());
    }

    protected VeggiePizza(Dough dough, Sauce sause, Cheese cheese,
	    Veggies[] veggies, Pepperoni papperoni, Clams clams) {
	super(dough, sause, cheese, veggies, papperoni, clams);
    }

    @Override
    protected void prepare() {
	System.out.println("Preparing : " + name);
    }
}
