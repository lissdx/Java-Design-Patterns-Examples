
public class GumballMachineTest {

	public static void main(String[] args) {
		int gumballCount = 2;
		final String location = "Seattle";
		
		GumballMachine gumballMachine = new GumballMachine(location, gumballCount);
		GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
		
		gumballMonitor.report();

	}

}
