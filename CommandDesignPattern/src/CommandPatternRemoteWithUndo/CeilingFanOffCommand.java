package CommandPatternRemoteWithUndo;

public class CeilingFanOffCommand implements CommandIF {
	CeilingFan ceilingFan;
	String lastSpeedStatus;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	public void execute() {
		lastSpeedStatus = ceilingFan.getStatus();
		ceilingFan.off();
		System.out.println(ceilingFan);
	}

	@Override
	public void undo() {
		switch (lastSpeedStatus) {
		case CeilingFan.CEILINGFAN_IS_HIGH:
			ceilingFan.high();
			break;
		case CeilingFan.CEILINGFAN_IS_LOW:
			ceilingFan.low();
			break;
		case CeilingFan.CEILINGFAN_IS_MEDIUM:
			ceilingFan.medium();
			break;
		default:
			break;
		}
		System.out.println(ceilingFan);
	}
}
