import FSM.pull.examples.GumballMachineChain;


public class GumballMachine extends GumballMachineChain{
    private final String location;
    
    public GumballMachine( final String location, int gumballCount ) {
        super( gumballCount )
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }

    public int getGumballCount() {
        return super.;
    }
    
    
}
