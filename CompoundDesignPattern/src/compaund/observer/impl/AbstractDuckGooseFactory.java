package compaund.observer.impl;

import compaund.observer.interfaces.QuackableIF;

public abstract class AbstractDuckGooseFactory {
    
    private final AbstractGooseFactory gooseFactory;

    protected AbstractDuckGooseFactory( AbstractGooseFactory gooseFactory ) {
        this.gooseFactory = gooseFactory;
    }
    
    public AbstractGooseFactory getGooseFactory() {
        return gooseFactory;
    }
    
    public abstract QuackableIF createDuckGoose();

}
