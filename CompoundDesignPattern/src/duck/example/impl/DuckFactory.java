package duck.example.impl;

import duck.example.interfaces.QuackableIF;

public class DuckFactory extends AbstractDuckFactory {

    @Override
    public QuackableIF createMallarDuck() {        
        return new MallarDuck();
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
