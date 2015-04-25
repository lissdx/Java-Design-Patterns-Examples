package duck.example.impl;

import duck.example.interfaces.QuackableIF;

public class RedHatDuck implements QuackableIF {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

}
