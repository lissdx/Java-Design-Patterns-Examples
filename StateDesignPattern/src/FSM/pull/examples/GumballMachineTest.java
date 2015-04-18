package FSM.pull.examples;

public class GumballMachineTest {

	public static void main(String[] args) {
	    GumballMachineChain gumballMachine = new GumballMachineChain(2);

            System.out.println(gumballMachine);		
            
            gumballMachine.pull();
            
            System.out.println(gumballMachine);
            
            gumballMachine.pull();
            
            System.out.println(gumballMachine);

            gumballMachine.pull();
            
            System.out.println(gumballMachine);
            
            gumballMachine.pull();
            
            System.out.println(gumballMachine);
            
            gumballMachine.pull();
            
            System.out.println(gumballMachine);
            
            gumballMachine.pull();
            
            System.out.println(gumballMachine);
            
            gumballMachine.pull();
            
            System.out.println(gumballMachine);
            
            gumballMachine.pull();
            
            System.out.println(gumballMachine);
            
            gumballMachine.pull();
            
            System.out.println(gumballMachine);    
            
            gumballMachine.refillGumBall( 1 );
            
            gumballMachine.pull();
            
            System.out.println(gumballMachine);
            
            gumballMachine.pull();
            
            System.out.println(gumballMachine);
            
            gumballMachine.pull();
            
            System.out.println(gumballMachine);
            

	}

}
