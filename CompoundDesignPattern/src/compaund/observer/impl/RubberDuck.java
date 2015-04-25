package compaund.observer.impl;

import compaund.observer.interfaces.ObserverIF;
import compaund.observer.interfaces.QuackableIF;

public class RubberDuck implements QuackableIF {

    private final Observable observable;
    
    public RubberDuck() {
        this.observable = new Observable( this );
    }
    
    @Override
    public void registerObserver(ObserverIF observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();        
    }

    @Override
    public String toString() {
        return "RedHatDuck";
    }
}
