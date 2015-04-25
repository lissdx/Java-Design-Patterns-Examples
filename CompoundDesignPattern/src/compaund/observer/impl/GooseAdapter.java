package compaund.observer.impl;

import compaund.observer.interfaces.HonkableIF;
import compaund.observer.interfaces.ObserverIF;
import compaund.observer.interfaces.QuackableIF;


public class GooseAdapter implements QuackableIF {
    private final HonkableIF goose;
    
    public GooseAdapter( final HonkableIF goose ) {
        this.goose = goose; 
    }
    
    @Override
    public void quack() {
        this.goose.honk();
    }

    @Override
    public void registerObserver(ObserverIF observer) {
        goose.registerObserver( observer );
    }

    @Override
    public void notifyObservers() {
        goose.notifyObservers();
    }

    @Override
    public String toString() {
        return goose.toString();
    }
}
