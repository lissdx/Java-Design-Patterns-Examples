package pizza.abstractFactory;

public class ClamPizza extends Pizza {

    public static ClamPizza build(PizzaIngredientFactoryIF ingredientFactory) {

	return new ClamPizza(ingredientFactory.createDough(),
		ingredientFactory.createSauce(),
		ingredientFactory.createCheese(),
		ingredientFactory.createVeggies(),
		ingredientFactory.createPepperoni(),
		ingredientFactory.createClams());
    }

    protected ClamPizza(Dough dough, Sauce sause, Cheese cheese,
	    Veggies[] veggies, Pepperoni papperoni, Clams clams) {
	super(dough, sause, cheese, veggies, papperoni, clams);
    }

    @Override
    protected void prepare() {
	System.out.println("Preparing : " + name);
    }
}