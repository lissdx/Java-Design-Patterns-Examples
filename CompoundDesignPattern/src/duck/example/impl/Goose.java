package duck.example.impl;

import duck.example.interfaces.HonkableIF;

public class Goose implements HonkableIF {

    @Override
    public void honk() {
        System.out.println("Honk");
    }

}
