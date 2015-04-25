package compaund.observer.impl;

import compaund.observer.interfaces.HonkableIF;

public class GooseFactory extends AbstractGooseFactory {
    
    @Override
    public HonkableIF createGoose() {
        return new Goose();
    }

}
