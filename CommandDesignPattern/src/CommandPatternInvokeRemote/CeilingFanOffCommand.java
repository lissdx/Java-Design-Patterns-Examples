package CommandPatternInvokeRemote;

public class CeilingFanOffCommand implements CommandIF {
	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.off();
		System.out.println(ceilingFan);
	}
}
