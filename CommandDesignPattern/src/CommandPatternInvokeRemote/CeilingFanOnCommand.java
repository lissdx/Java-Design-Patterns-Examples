package CommandPatternInvokeRemote;

public class CeilingFanOnCommand implements CommandIF {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
		System.out.println(ceilingFan);
	}
}
