package duck.example.impl;

import duck.example.interfaces.QuackableIF;

public class RubberDuck implements QuackableIF {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

}
