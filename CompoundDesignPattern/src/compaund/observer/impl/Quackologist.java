package compaund.observer.impl;

import compaund.observer.interfaces.ObservableIF;
import compaund.observer.interfaces.ObserverIF;


public class Quackologist implements ObserverIF {

    @Override
    public void update( ObservableIF duck) {
        System.out.println("Quackologist : " + duck + " just quacked");
    }

}
