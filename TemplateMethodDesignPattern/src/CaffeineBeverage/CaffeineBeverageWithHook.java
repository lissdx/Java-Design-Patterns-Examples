package CaffeineBeverage;

public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }    

    protected abstract void brew();
    protected abstract void addCondiments();
    
    private void pourInCup() {
        System.out.println("Pouring Into Cup");
    }

    private void boilWater() {
        System.out.println("Boiling Water");
    }

    // It's THE HOOK METHOD
    // The subclass may override it, but doesn't have to
    protected boolean customerWantsCondiments() {
        return true;
    } 

}
