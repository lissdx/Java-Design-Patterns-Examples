package SimpleCommandPattern;

public class RemoteControlTest {

    public static void main(String[] args) {
	SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
	Light light = new Light();
	GarageDoor garageDoor = new GarageDoor();
	
	GarageOpenCommand garageOpenCommand = new GarageOpenCommand(garageDoor);	
	LightOnCommand lightOnCommand = new LightOnCommand(light);

	simpleRemoteControl.setCommand(lightOnCommand);
	simpleRemoteControl.buttonWasPressed();
	simpleRemoteControl.setCommand(garageOpenCommand);
	simpleRemoteControl.buttonWasPressed();	
    }
}
