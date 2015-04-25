package compaund.observer.impl;

import compaund.observer.interfaces.QuackableIF;



public class CountingDuckFactory extends DuckFactory {

    @Override
    public QuackableIF createDuckCall() {
        return new QuackCounter(super.createDuckCall());
    }

    @Override
    public QuackableIF createMallarDuck() {
        // TODO Auto-generated method stub
        return new QuackCounter(super.createMallarDuck());
    }

    @Override
    public QuackableIF createRedHatDuck() {
        // TODO Auto-generated method stub
        return new QuackCounter(super.createRedHatDuck());
    }

    @Override
    public QuackableIF createRubberDuck() {
        // TODO Auto-generated method stub
        return new QuackCounter(super.createRubberDuck());
    }
}
