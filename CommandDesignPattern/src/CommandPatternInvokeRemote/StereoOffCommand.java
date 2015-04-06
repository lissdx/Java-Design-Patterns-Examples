package CommandPatternInvokeRemote;

public class StereoOffCommand implements CommandIF {

	private final Stereo stereo;

	public StereoOffCommand(final Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
		System.out.println(stereo);
	}

}
