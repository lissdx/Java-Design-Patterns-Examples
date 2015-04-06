package CommandPatternInvokeRemote;
public class LightOnCommand implements CommandIF {

    private final Light light;

    public LightOnCommand( final Light light ) {
	this.light = light;
    }

    @Override
    public void execute() {
	light.on();
	System.out.println( light );
    }

}
