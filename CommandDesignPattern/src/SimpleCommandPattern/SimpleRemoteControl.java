package SimpleCommandPattern;

public class SimpleRemoteControl {
    CommandIF slot;

    public SimpleRemoteControl() {
    }
    
    public void setCommand( CommandIF command ){
	slot = command;
    }
    
    public void buttonWasPressed(){
	slot.execute();
    }
}
