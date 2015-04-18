
public class GumballMonitor {
    private final GumballMachine gumballMachine;

    public GumballMonitor( final GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    public void report() {
        System.out.println("GumballMachine location  : [ " + this.gumballMachine.getLocation() +" ] " );
        System.out.println("GumballMachine inventory : [ " + this.gumballMachine.getGumballCount() +" ] " );
        System.out.println("GumballMachine location : [ " + this.gumballMachine.getSt +" ] " );
    }
    
    
}
