package CommandPatternInvokeRemote;
public class GarageOpenCommand implements CommandIF {

    private final GarageDoor garageDoor;

    public GarageOpenCommand( final GarageDoor garageDoor ) {
	this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
	garageDoor.open();
	System.out.println( garageDoor );
    }

}
