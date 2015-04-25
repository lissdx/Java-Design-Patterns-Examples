package duck.example.impl;

import duck.example.interfaces.QuackableIF;

public class MallarDuck implements QuackableIF {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

}
