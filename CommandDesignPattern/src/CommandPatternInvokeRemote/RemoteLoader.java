package CommandPatternInvokeRemote;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen Room");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("Garage");
		Stereo stereo = new Stereo("Living Room");
		
		int slot = 0;
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		GarageCloseCommand garageCloseCommand = new GarageCloseCommand(garageDoor);
		GarageOpenCommand garageOpenCommand = new GarageOpenCommand(garageDoor);
		
		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffCommand= new StereoOffCommand(stereo);
		
		remoteControl.setCommands(slot++, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommands(slot++, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommands(slot++, ceilingFanOnCommand, ceilingFanOffCommand);
		remoteControl.setCommands(slot++, garageOpenCommand, garageCloseCommand);
		remoteControl.setCommands(slot++, stereoOnWithCDCommand, stereoOffCommand);
		
		System.out.println( remoteControl );
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);		
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);		
	}

}
