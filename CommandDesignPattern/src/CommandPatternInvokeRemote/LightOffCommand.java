package CommandPatternInvokeRemote;
public class LightOffCommand implements CommandIF {

    private final Light light;

    public LightOffCommand( final Light light ) {
	this.light = light;
    }

    @Override
    public void execute() {
	light.off();
	System.out.println( light );
    }

}
