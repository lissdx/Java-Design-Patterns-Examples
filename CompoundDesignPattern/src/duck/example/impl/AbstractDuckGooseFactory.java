package duck.example.impl;

import duck.example.interfaces.QuackableIF;

public abstract class AbstractDuckGooseFactory {
    
    private final AbstractGooseFactory gooseFactory;

    protected AbstractDuckGooseFactory( AbstractGooseFactory gooseFactory ) {
        this.gooseFactory = gooseFactory;
    }

    public abstract QuackableIF createDuckGoose();

    public AbstractGooseFactory getGooseFactory() {
        return gooseFactory;
    }
}
