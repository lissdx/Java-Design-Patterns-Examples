package CommandPatternInvokeRemote;

public class Light {
	private static final String LIGHT_IS_ON = "Light is On";
	private static final String LIGHT_IS_OFF = "Light is Off";
	private static final String DEFAULT_STATUS = LIGHT_IS_OFF;
	private String currentStatus;
	private final String location;

	public Light(final String location) {
		this(location, DEFAULT_STATUS);
	}

	public Light(final String location, final String defaultStatus) {
		this.currentStatus = defaultStatus;
		this.location = location;
	}

	public void on() {
		this.currentStatus = LIGHT_IS_ON;
	}

	public void off() {
		this.currentStatus = LIGHT_IS_OFF;
	}

	@Override
	public String toString() {
		return "Current Light Status : [ " + location + " ] : [ " + currentStatus + " ]";
	}
}
