package duck.example.impl;

import duck.example.interfaces.HonkableIF;

public class GooseFactory extends AbstractGooseFactory {
    
    @Override
    public HonkableIF createGoose() {
        return new Goose();
    }

}
