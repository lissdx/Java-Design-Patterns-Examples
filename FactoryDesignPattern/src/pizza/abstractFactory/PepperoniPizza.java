package pizza.abstractFactory;

public class PepperoniPizza extends Pizza {

    public static PepperoniPizza build(PizzaIngredientFactoryIF ingredientFactory) {

	return new PepperoniPizza(ingredientFactory.createDough(),
		ingredientFactory.createSauce(),
		ingredientFactory.createCheese(),
		ingredientFactory.createVeggies(),
		ingredientFactory.createPepperoni(),
		ingredientFactory.createClams());
    }

    protected PepperoniPizza(Dough dough, Sauce sause, Cheese cheese,
	    Veggies[] veggies, Pepperoni papperoni, Clams clams) {
	super(dough, sause, cheese, veggies, papperoni, clams);
    }

    @Override
    protected void prepare() {
	System.out.println("Preparing : " + name);
    }
}