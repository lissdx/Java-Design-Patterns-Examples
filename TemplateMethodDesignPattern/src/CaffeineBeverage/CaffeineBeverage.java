package CaffeineBeverage;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void pourInCup() {
        System.out.println("Pouring Into Cup");
    }

    private void boilWater() {
        System.out.println("Boiling Water");
    }

    protected abstract void brew();
    protected abstract void addCondiments();

}
