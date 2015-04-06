package CommandPatternInvokeRemote;

public class GarageCloseCommand implements CommandIF {

	private final GarageDoor garageDoor;

	public GarageCloseCommand(final GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.close();
		System.out.println(garageDoor);
	}

}
