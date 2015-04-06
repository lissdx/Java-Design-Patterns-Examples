package CommandPatternRemoteWithUndo;

public class LightOffCommand implements CommandIF {

	private final Light light;

	public LightOffCommand(final Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
		System.out.println(light);
	}

	@Override
	public void undo() {
		light.on();
		System.out.println(light);
	}

}
