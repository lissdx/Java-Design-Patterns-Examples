package pizza.abstractFactory;

public class NYPpizzaIngredientFactory implements PizzaIngredientFactoryIF {

    @Override
    public Dough createDough() {
	return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
	return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
	Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};	
	return veggies;
    }


    @Override
    public Clams createClams() {
	return new FreshClams();
    }

    @Override
    public Sauce createSauce() {
	return new MarinaraSauce();
    }

    @Override
    public Pepperoni createPepperoni() {
	// TODO Auto-generated method stub
	return new SlicedPepperoni();
    }

}
