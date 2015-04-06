package SimpleCommandPattern;
public class LightOnCommand implements CommandIF {

    private Light light;

    public LightOnCommand( Light light ) {
	this.light = light;
    }

    @Override
    public void execute() {
	light.on();
	System.out.println( light );
    }

}
