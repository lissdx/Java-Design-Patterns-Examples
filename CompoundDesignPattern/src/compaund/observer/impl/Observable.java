package compaund.observer.impl;

import java.util.ArrayList;

import compaund.observer.interfaces.ObservableIF;
import compaund.observer.interfaces.ObserverIF;

public class Observable implements ObservableIF {
    private final ArrayList<ObserverIF> observerList = new ArrayList<>();
    private final ObservableIF duck;

    public Observable( final ObservableIF duck ) {
        this.duck = duck;
    }
    
    @Override
    public void registerObserver(ObserverIF observer) {
        observerList.add(observer);        
    }

    @Override
    public void notifyObservers() {
        for( ObserverIF observer : observerList ){
            observer.update( duck );
        }
    }

}
