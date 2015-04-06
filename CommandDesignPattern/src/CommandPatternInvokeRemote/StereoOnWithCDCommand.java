package CommandPatternInvokeRemote;

public class StereoOnWithCDCommand implements CommandIF {

	private final Stereo stereo;

	public StereoOnWithCDCommand(final Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
		System.out.println(stereo);
	}

}
