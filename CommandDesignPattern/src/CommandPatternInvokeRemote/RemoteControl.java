package CommandPatternInvokeRemote;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private final int MAX_COMMANDS_CAPACITY = 7;
    final List<CommandIF> onCommands;
    final List<CommandIF> offCommands;

    public RemoteControl() {
	this.offCommands = new ArrayList<>();
	this.onCommands = new ArrayList<>();

	CommandIF noCommand = new NoCommand();
	for (int i = 0; i < MAX_COMMANDS_CAPACITY; ++i) {
	    offCommands.add(noCommand);
	    onCommands.add(noCommand);
	}
    }

    public void setCommands(int slot, CommandIF onCommand, CommandIF offCommand) {
	setOnCommand(slot, onCommand);
	setOffCommand(slot, offCommand);
    }

    private void setOnCommand(int slot, CommandIF command) {
	onCommands.set(slot, command);
    }

    private void setOffCommand(int slot, CommandIF command) {
	offCommands.set(slot, command);
    }

    public void onButtonWasPushed(int slot) {
	if (slot < onCommands.size()) {
	    onCommands.get(slot).execute();
	}
    }

    public void offButtonWasPushed(int slot) {
	if (slot < offCommands.size()) {
	    offCommands.get(slot).execute();
	}
    }

    public String toString() {
	StringBuffer stringBuff = new StringBuffer();
	stringBuff.append("\n------ Remote Control -------\n");
	int onCommandsCnt = 0;
	int offCommandsCnt = 0;
	
	stringBuff.append("\n------ onCommands List -------\n");
	for ( CommandIF command : onCommands) {
	    stringBuff.append("[slot " + onCommandsCnt++ + "] "
		    + command.getClass().getName() + "\n");
	}
	stringBuff.append("\n------ offCommands List -------\n");
	for ( CommandIF command : offCommands) {
	    stringBuff.append("[slot " + offCommandsCnt++ + "] "
		    + command.getClass().getName() + "\n");
	}
	
	return stringBuff.toString();
    }
}
