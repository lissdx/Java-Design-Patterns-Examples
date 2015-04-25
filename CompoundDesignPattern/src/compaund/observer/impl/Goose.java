package compaund.observer.impl;

import compaund.observer.interfaces.HonkableIF;
import compaund.observer.interfaces.ObserverIF;


public class Goose implements HonkableIF {
    private final Observable observable;
    
    public Goose() {
        this.observable = new Observable( new GooseAdapter( this ));
    }
    
    @Override
    public void honk() {
        System.out.println("Honk");
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverIF observer) {
        observable.registerObserver( observer );        
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();        
    }
    
    @Override
    public String toString() {
        return "Goose";
    }
}
