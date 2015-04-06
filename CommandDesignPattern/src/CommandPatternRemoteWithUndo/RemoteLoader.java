package CommandPatternRemoteWithUndo;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControlWIthUndo remoteControl = new RemoteControlWIthUndo();
		
		CeilingFan ceilingFan = new CeilingFan("Living Room");	
		int slot = 0;
		
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);		
		
		remoteControl.setCommands(slot++, ceilingFanMediumCommand, ceilingFanOffCommand);
		remoteControl.setCommands(slot++, ceilingFanHighCommand, ceilingFanOffCommand);
		remoteControl.setCommands(slot++, ceilingFanLowCommand, ceilingFanOffCommand);
		
		System.out.println( remoteControl );
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println( remoteControl );		
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(1);
		System.out.println( remoteControl );
		remoteControl.undoButtonWasPushed();
	}

}
