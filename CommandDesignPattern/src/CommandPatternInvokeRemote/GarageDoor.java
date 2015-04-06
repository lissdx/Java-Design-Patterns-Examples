package CommandPatternInvokeRemote;

public class GarageDoor {
    private static final String GARAGE_DOOR_IS_OPENED = "Garage Door is OPENED"; 
    private static final String GARAGE_DOOR_IS_CLOSED = "Garage Door is CLOSED";
    private static final String DEFAULT_STATUS = GARAGE_DOOR_IS_CLOSED;
    private String currentStatus;        
	private final String location;

	public GarageDoor(final String location) {
		this(location, DEFAULT_STATUS);
	}

	public GarageDoor(final String location, final String defaultStatus) {
		this.currentStatus = defaultStatus;
		this.location = location;
	}
 
    public void open() {
	this.currentStatus = GARAGE_DOOR_IS_OPENED;
    }

    public void close() {
	this.currentStatus = GARAGE_DOOR_IS_CLOSED;
    }
    
	@Override
	public String toString() {
		return "Current GarageDoor Status : [ " + location + " ] : [ " + currentStatus + " ]";
	}    
}
