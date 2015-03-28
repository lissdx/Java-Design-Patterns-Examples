package CustomObserverUsageExamle;

import java.util.ArrayList;
import java.util.List;

enum MesurementsTypes {
	   TEMPERATURE(0), HUMIDITY(1), PRESSURE(2);
	   
	    private final int value;

	    private MesurementsTypes(int value) {
	        this.value = value;
	    }

	    public int getValue() {
	        return value;
	    }
}

public class WeatherData {

	private final List<Float> data;

	public WeatherData() {
		data = new ArrayList<>();
		data.add(MesurementsTypes.TEMPERATURE.getValue(), 0f);
		data.add(MesurementsTypes.HUMIDITY.getValue(), 0f);
		data.add(MesurementsTypes.PRESSURE.getValue(), 0f);
	}

	public float getTemperature() {
		return data.get(MesurementsTypes.TEMPERATURE.getValue());
	}

	public void setTemperature(float tmp) {
		data.set(MesurementsTypes.TEMPERATURE.getValue(), tmp);
	}

	public float getHumidity() {
		return data.get(MesurementsTypes.HUMIDITY.getValue());
	}

	public void setHumidity(float humidity) {
		if (humidity > 0f) {
			data.set(MesurementsTypes.HUMIDITY.getValue(), humidity);
		}
	}

	public float getPressure() {
		return data.get(MesurementsTypes.PRESSURE.getValue());
	}

	public void setPressure(float pressure) {
		if (pressure > 0f) {
			data.set(MesurementsTypes.PRESSURE.getValue(), pressure);
		}
	}
}
