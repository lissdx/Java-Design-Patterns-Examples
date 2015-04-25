package compaund.observer.impl;

import compaund.observer.interfaces.QuackableIF;



public abstract class AbstractDuckFactory {
    
    public abstract QuackableIF createMallarDuck();
    public abstract QuackableIF createRedHatDuck();
    public abstract QuackableIF createDuckCall();
    public abstract QuackableIF createRubberDuck();
}
