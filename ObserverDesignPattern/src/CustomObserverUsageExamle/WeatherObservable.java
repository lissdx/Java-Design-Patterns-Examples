package CustomObserverUsageExamle;
import CustomObserver.Utils.AbstractObservable;

	
public class WeatherObservable extends AbstractObservable<WeatherData> {
		
	public WeatherObservable() {
		super(new WeatherData());
	}

	public void measurmentChanged(){
		notifyObservers();
	}
	
	public void setMeasurements( final float tmp, final float humidity, final float pressure ){
		
		WeatherData updatedWeatherData = new WeatherData();
		updatedWeatherData.setHumidity(humidity);
		updatedWeatherData.setTemperature(tmp);
		updatedWeatherData.setPressure(pressure);
		setData(updatedWeatherData);
		
		measurmentChanged();
	}

}

