package pizza.abstractFactory;

public class CheesePizza extends Pizza {
    public static CheesePizza build(PizzaIngredientFactoryIF ingredientFactory) {

	return new CheesePizza( ingredientFactory.createDough(),
                		ingredientFactory.createSauce(),
                		ingredientFactory.createCheese(),
                		ingredientFactory.createVeggies(),
                		ingredientFactory.createPepperoni(),
                		ingredientFactory.createClams());
    }

    protected CheesePizza(Dough dough, Sauce sause, Cheese cheese,
	    Veggies[] veggies, Pepperoni papperoni, Clams clams) {
	super(dough, sause, cheese, veggies, papperoni, clams);
    }

    
    @Override
    protected void prepare() {
	System.out.println("Preparing : " + name );
    }

}
