package duck.example.impl;

import duck.example.interfaces.QuackableIF;

public class DuckCall implements QuackableIF {

    @Override
    public void quack() {
        System.out.println("Kwak");
    }

}
