package CommandPatternInvokeRemote;

public class Stereo {
	private static final String STEREO_IS_ON = "Stereo is On";
	private static final String STEREO_IS_OFF = "Stereo is Off";
	private static final String DEFAULT_STEREO_STATUS = STEREO_IS_OFF;

	private static final String MODE_STEREO_CD = "Stereo is set for CD input";
	private static final String MODE_STEREO_DVD = "Stereo is set for DVD input";
	private static final String MODE_STEREO_RADIO = "Stereo is set for Radio";
	private static final String MODE_STEREO_OFF = STEREO_IS_OFF;

	private static final int MAX_VOLUME = 11;
	private static final int DEFAULT_VOLUME = 10;
	private static final int OFF_VOLUME = 0;

	private String currentStatus;
	private String currentMode;
	private final String location;
	private int volume;

	public Stereo(final String location) {
		this(location, DEFAULT_STEREO_STATUS, STEREO_IS_OFF, OFF_VOLUME);
	}

	public Stereo(final String location, final String defaultStatus, final String defaultMode, int volume) {
		this.location = location;
		this.currentStatus = defaultStatus;
		this.currentMode = defaultMode;
		this.volume = (volume >= 1 && volume <= MAX_VOLUME) ? volume : OFF_VOLUME;
	}

	public void on() {
		this.currentStatus = STEREO_IS_ON;
		this.currentMode = DEFAULT_STEREO_STATUS;
		this.volume = DEFAULT_VOLUME;
	}

	public void off() {
		this.currentStatus = STEREO_IS_OFF;
		this.currentMode = MODE_STEREO_OFF;
		this.volume = OFF_VOLUME;
	}

	public void setCD() {
		if (this.currentStatus == STEREO_IS_ON) {
			this.currentMode = MODE_STEREO_CD;
		}

	}

	public void setDVD() {
		if (this.currentStatus == STEREO_IS_ON) {
			this.currentMode = MODE_STEREO_DVD;
		}
	}

	public void setRadio() {
		if (this.currentStatus == STEREO_IS_ON) {
			this.currentMode = MODE_STEREO_RADIO;
		}
	}

	public void setVolume(int volume) {
		// code to set the volume
		// valid range: 1-11 (after all 11 is better than 10, right?)
		if (this.currentStatus == STEREO_IS_ON) {
			this.volume = ( volume >= 1 && volume <= MAX_VOLUME ) ? volume : this.volume;
		}
	}

	@Override
	public String toString() {
		return "Current Stereo Status : [ " + location + " ] : [ " + currentStatus + " ] : [ " + currentMode + " ] : [ volume set to " + volume + " ] ";
	}
}
