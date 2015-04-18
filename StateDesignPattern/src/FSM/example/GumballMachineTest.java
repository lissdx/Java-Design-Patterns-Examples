package FSM.example;

public class GumballMachineTest {

	public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(3);

            System.out.println(gumballMachine);		
            
            gumballMachine.insertQuarter();            
            System.out.println(gumballMachine);            
            gumballMachine.turnCrank();            
            System.out.println(gumballMachine);
            
            gumballMachine.insertQuarter();
            System.out.println(gumballMachine);
            gumballMachine.turnCrank();
            System.out.println(gumballMachine); 
            
            gumballMachine.insertQuarter();
            System.out.println(gumballMachine);
            gumballMachine.turnCrank();
            System.out.println(gumballMachine); 
            
            gumballMachine.insertQuarter();            
            System.out.println(gumballMachine);          
            gumballMachine.turnCrank();           
            System.out.println(gumballMachine);             

	}

}
