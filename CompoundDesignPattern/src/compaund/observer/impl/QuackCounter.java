package compaund.observer.impl;

import compaund.observer.interfaces.ObserverIF;
import compaund.observer.interfaces.QuackableIF;


public class QuackCounter implements QuackableIF {
    private final QuackableIF duck;
    private static int numberOfQuacks;
    
    public QuackCounter( final QuackableIF duck ) {
        this.duck = duck;
    }
    
    @Override
    public void quack() {
        duck.quack();
        setNumberOfQuacks(getNumberOfQuacks() + 1);
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    public static void resetQuackCounter() {
        setNumberOfQuacks(0);
    }
    
    public static void setNumberOfQuacks(int numberOfQuacks) {
        QuackCounter.numberOfQuacks = numberOfQuacks;
    }

    @Override
    public void registerObserver(ObserverIF observer) {
        duck.registerObserver(observer);        
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();        
    }

}
