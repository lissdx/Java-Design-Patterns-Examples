package compaund.observer.impl;

import java.util.ArrayList;
import java.util.Collection;

import compaund.observer.interfaces.ObserverIF;
import compaund.observer.interfaces.QuackableIF;

public class Flock implements QuackableIF {
    private final ArrayList<QuackableIF> quackableList;
    
    public Flock() {
        quackableList = new ArrayList<>();
    }
    
    public Flock( Collection<QuackableIF> quackableCollection) {
        quackableList = new ArrayList<>( quackableCollection );
    }
    
    public void add( final QuackableIF duck) {
        this.quackableList.add( duck );
    }
    
    @Override
    public void quack() {
        for( QuackableIF duck : quackableList ){
            duck.quack();
        }
    }

    @Override
    public void registerObserver(ObserverIF observer) {
        for( QuackableIF duck : quackableList ){
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        // Empty. Any duck calls notifyObservers on his quack     
    }

}
