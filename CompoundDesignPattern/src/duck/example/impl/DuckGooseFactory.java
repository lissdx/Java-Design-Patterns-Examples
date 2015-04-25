package duck.example.impl;

import duck.example.interfaces.QuackableIF;

public class DuckGooseFactory extends AbstractDuckGooseFactory {
   
    public DuckGooseFactory( AbstractGooseFactory gooseFactory ) {
        super(gooseFactory);
    }    
    
    @Override
    public QuackableIF createDuckGoose() {
        return new GooseAdapter( this.getGooseFactory().createGoose());
    }
    
//    @Override
//    public HonkableIF createGoose() {
//        return super.createGoose();
//    }
}
