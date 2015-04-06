package CommandPatternRemoteWithUndo;

public class LightOnCommand implements CommandIF {

	private final Light light;

	public LightOnCommand(final Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
		System.out.println(light);
	}

	@Override
	public void undo() {
		light.off();
		System.out.println(light);
	}

}
