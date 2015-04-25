package compaund.observer.impl;

import compaund.observer.interfaces.QuackableIF;


public class DuckFactory extends AbstractDuckFactory {

    @Override
    public QuackableIF createMallarDuck() {        
        return new Mallarduck();
    }

    @Override
    public QuackableIF createRedHatDuck() {
        return new RedHatDuck();
    }

    @Override
    public QuackableIF createDuckCall() {
        return new DuckCall();
    }

    @Override
    public QuackableIF createRubberDuck() {
        return new RubberDuck();
    }

}
