package compaund.observer.impl;

import compaund.observer.interfaces.QuackableIF;

public class DuckGooseFactory extends AbstractDuckGooseFactory {
   
    public DuckGooseFactory( AbstractGooseFactory gooseFactory ) {
        super(gooseFactory);
    }    
    
    @Override
    public QuackableIF createDuckGoose() {
        return new GooseAdapter( this.getGooseFactory().createGoose());
    }
}
