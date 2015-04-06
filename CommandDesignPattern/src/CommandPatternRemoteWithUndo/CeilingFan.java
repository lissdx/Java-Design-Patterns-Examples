package CommandPatternRemoteWithUndo;

public class CeilingFan {
	public static final String CEILINGFAN_IS_LOW = "Ceiling fan is LOW";
	public static final String CEILINGFAN_IS_MEDIUM = "Ceiling fan is MEDIUM";
	public static final String CEILINGFAN_IS_HIGH = "Ceiling fan is HIGH";
	public static final String CEILINGFAN_IS_OFF = "Ceiling fan is Off";

	private String currentStatus;
	private final String location;	
 
	public CeilingFan(String location) {
		this.location = location;
		currentStatus = CEILINGFAN_IS_OFF;
	}
  
	public void high() {
		currentStatus = CEILINGFAN_IS_HIGH; 
	} 

	public void medium() {
		// turns the ceiling fan on to medium
		currentStatus = CEILINGFAN_IS_MEDIUM; 
	}

	public void low() {
		// turns the ceiling fan on to low
		currentStatus = CEILINGFAN_IS_LOW;
	}
 
	public void off() {
		// turns the ceiling fan off
		currentStatus = CEILINGFAN_IS_OFF;
	}
 
	public String getStatus(){
		return currentStatus;
	}
	
	@Override
	public String toString() {
		return "Current CeilingFan Status : [ " + location + " ] : [ " + currentStatus + " ]";
	}	
}
