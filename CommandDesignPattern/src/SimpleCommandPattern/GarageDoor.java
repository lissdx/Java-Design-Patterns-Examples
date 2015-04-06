package SimpleCommandPattern;

public class GarageDoor {
    private static final String GARAGE_DOOR_IS_OPENED = "Garage Door is Opened"; 
    private static final String GARAGE_DOOR_IS_CLOSED = "Light is Off";
    private static final String DEFAULT_STATUS = GARAGE_DOOR_IS_CLOSED;
    private String currentStatus;    
    
    public GarageDoor() {
	this(DEFAULT_STATUS);
    }
    public GarageDoor( final String defaultStatus ) {
	this.currentStatus = defaultStatus;
    }
 
    public void open() {
	this.currentStatus = GARAGE_DOOR_IS_OPENED;
    }

    public void close() {
	this.currentStatus = GARAGE_DOOR_IS_CLOSED;
    }
    
    @Override
    public String toString() {
	
        return "Current GarageDoor Status : " + currentStatus;
    }
}
