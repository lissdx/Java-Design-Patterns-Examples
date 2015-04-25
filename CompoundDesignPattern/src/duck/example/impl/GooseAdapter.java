package duck.example.impl;

import duck.example.interfaces.HonkableIF;
import duck.example.interfaces.QuackableIF;

public class GooseAdapter implements QuackableIF {
    private final HonkableIF goose;
    
    public GooseAdapter( final HonkableIF goose ) {
        this.goose = goose; 
    }
    
    @Override
    public void quack() {
        this.goose.honk();
    }

}
